package com.example.app_sql.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.app_sql.R
import com.example.app_sql.data.datamodels.BookData
import com.example.app_sql.databinding.FragmentAddBinding


class AddFragment : Fragment() {

    private lateinit var binding: FragmentAddBinding
    private val viewModel:MainViewModel by activityViewModels()
    private var selectedGenre: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAddBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupSpinner()
        binding.btnCancel.setOnClickListener {
            findNavController().navigate(AddFragmentDirections.actionAddFragmentToMainFragment())
        }
        binding.btnAdd.setOnClickListener {
        val newTitle = binding.addTextInputTitle.text.toString()
        val newAuthor = binding.addTextInputAuthor.text.toString()

        if (newTitle.isNotEmpty() && newAuthor.isNotEmpty()) {
            viewModel.insertBook(
                BookData(
                    0,
                    newTitle,
                    newAuthor,
                    selectedGenre,
                    false,
                    false,
                    false,
                    0,
                    "",
                    R.drawable.test_book
                )
            )
            findNavController().navigate(AddFragmentDirections.actionAddFragmentToMainFragment())
        }

        }

    }

    private fun setupSpinner() {
        val spinner = binding.spinner
        ArrayAdapter.createFromResource(
            requireContext(),
            R.array.spinner_items,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = adapter
        }

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View?,
                position: Int,
                id: Long
            ) {
                selectedGenre = parent.getItemAtPosition(position).toString()
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                // Optional: Setzen Sie hier einen Standardwert, falls nichts ausgewählt wurde
                selectedGenre = ""
            }
        }
    }

}