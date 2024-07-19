package com.example.app_sql.util

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.app_sql.R
import com.example.app_sql.data.datamodels.BookData
import com.example.app_sql.databinding.ListItemBinding
import com.example.app_sql.ui.MainFragmentDirections
import com.example.app_sql.ui.MainViewModel

class Adapter(
    private val dataset: List<BookData>,
    private val viewModel: MainViewModel
): RecyclerView.Adapter<Adapter.ViewHolder>() {

    inner class ViewHolder(val binding: ListItemBinding): RecyclerView.ViewHolder(binding.root)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.ViewHolder {
        val binding = ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: Adapter.ViewHolder, position: Int) {
        val binding = holder.binding
        val book = dataset[position]
        binding.tvTitle.text = book.title
        binding.tvAuthor.text = book.author
        binding.imageView.setImageResource(book.image)
        binding.tvGenre.text = book.genre
        if (book.finished) {
            book.isReading = false
            book.wantToRead = false
            binding.tvReadStatus.setText(R.string.finished)
        } else if (book.wantToRead) {
            book.isReading = false
            book.finished = false
            binding.tvReadStatus.setText(R.string.wanttoread)
        } else if (book.isReading) {
            book.finished = false
            book.wantToRead = false
            binding.tvReadStatus.setText(R.string.isreading)
        } else {
            book.finished = false
            book.wantToRead = false
            book.isReading = false
            binding.tvReadStatus.visibility = View.GONE
        }
        binding.cvBookItem.setOnClickListener {
            viewModel.getBookById(book.id)
            it.findNavController().navigate(MainFragmentDirections.actionMainFragmentToDetailFragment(book.id))
        }
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

}