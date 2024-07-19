package com.example.app_sql.ui

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.app_sql.R
import com.example.app_sql.data.datamodels.BookData
import com.example.app_sql.databinding.FragmentAddBinding
import com.example.app_sql.databinding.FragmentDetailBinding


class DetailFragment : Fragment() {

    private lateinit var binding: FragmentDetailBinding
    private val viewModel: MainViewModel by activityViewModels()
    private val args: DetailFragmentArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetailBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val actualBook = viewModel.getBookById(args.bookID)
        viewModel.getBookById(args.bookID).observe(viewLifecycleOwner) { book ->
            if (book != null) {
                updateUI(book)
                setupRatingBar(book)
                binding.btnEdit.setOnClickListener {
                    viewModel.updateBook(book)
                    findNavController().navigate(DetailFragmentDirections.actionDetailFragmentToMainFragment())
                    Log.d("DetailFragment", "Updating book with new rating: $book")
                }
            }

        }
        binding.btnCancel.setOnClickListener {
            findNavController().navigate(DetailFragmentDirections.actionDetailFragmentToMainFragment())
        }
        viewModel.getBookById(args.bookID).observe(viewLifecycleOwner) { book ->
            binding.btnDelete.setOnClickListener {
                viewModel.deleteBook(book)
                findNavController().navigate(DetailFragmentDirections.actionDetailFragmentToMainFragment())

            }

        }
    }

    private fun updateUI(book: BookData) {
        binding.ivBook.setImageResource(book.image)
        binding.tvTitle.text = book.title
        binding.tvAuthor.text = book.author
        binding.tvReview.text = book.note
        binding.ratingBar.rating = book.review.toFloat()

        binding.switchFinished.isChecked = book.finished
        binding.switchIsreading.isChecked = book.isReading
        binding.switchWanttoread.isChecked = book.wantToRead

        // Setze die OnCheckedChangeListener
        binding.switchFinished.setOnCheckedChangeListener { _, isChecked ->
            binding.switchIsreading.isChecked = false
            binding.switchWanttoread.isChecked = false
            viewModel.updateBook(book)
        }

        binding.switchIsreading.setOnCheckedChangeListener { _, isChecked ->
            binding.switchFinished.isChecked = false
            binding.switchWanttoread.isChecked = false
            book.isReading = isChecked
            viewModel.updateBook(book)
        }

        binding.switchWanttoread.setOnCheckedChangeListener { _, isChecked ->
            binding.switchFinished.isChecked = false
            binding.switchIsreading.isChecked = false
            book.wantToRead = isChecked
            viewModel.updateBook(book)
        }
    }

    private fun setupRatingBar(book: BookData) {
        binding.ratingBar.setOnRatingBarChangeListener { _, rating, fromUser ->
            if (fromUser) {
                val newRating = rating.toInt()
                if (book.review != newRating) {
                    book.review = newRating
                    viewModel.updateBook(book)
                    Log.d("DetailFragment", "Updating book ${book.id} with new rating: $newRating")
                }
                viewModel.updateBook(book)
            }
        }
    }
}
