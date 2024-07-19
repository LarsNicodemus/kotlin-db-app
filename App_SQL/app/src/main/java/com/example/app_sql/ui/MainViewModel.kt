package com.example.app_sql.ui

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.app_sql.data.Repository
import com.example.app_sql.data.datamodels.BookData
import com.example.app_sql.data.local.BookDatabase
import com.example.app_sql.data.local.getDatabase
import kotlinx.coroutines.launch


class MainViewModel(application: Application):AndroidViewModel(application) {
    private val database: BookDatabase = getDatabase(application)
    private val repository = Repository(database)

    val books = repository.bookList

    init {
        prepopulateDatabase()
    }

    fun insertBook(book: BookData) {
        viewModelScope.launch {
            repository.insertBook(book)
        }
    }

    fun deleteBook(book: BookData) {
        viewModelScope.launch {
            repository.deleteBook(book)
        }
    }

    fun updateBook(book: BookData) {
        viewModelScope.launch {
            repository.updateBook(book)
        }
    }

    fun deleteAllBooks() {
        viewModelScope.launch {
            repository.deleteAllBooks()
        }
    }

    fun getBookById(bookID: Long): LiveData<BookData> {
        return repository.getBookById(bookID)
    }

    fun prepopulateDatabase() {
        viewModelScope.launch {
            repository.prepopulate()
        }
    }

    fun isValidName(name: String): Boolean {
        // Name sollte nicht leer sein und keine Zahlen oder Sonderzeichen enthalten
        return name.isNotBlank() && name.matches(Regex("^[\\p{L} .'-]+$"))
    }


}