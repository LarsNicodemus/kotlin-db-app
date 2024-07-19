package com.example.app_sql.data

import android.content.ContentValues
import android.util.Log
import androidx.lifecycle.LiveData
import com.example.app_sql.data.datamodels.BookData
import com.example.app_sql.data.esampledata.BookExampleData
import com.example.app_sql.data.local.BookDatabase

class Repository(private var database: BookDatabase) {
    val bookList: LiveData<List<BookData>> = database.bookDao.getAllBooks()

    suspend fun insertBook(bookData: BookData) {
        try {
            database.bookDao.insertBook(bookData)
        } catch (e: Exception) {
            Log.d(ContentValues.TAG, "Failed to insert into Database: $e")
        }
    }

    suspend fun updateBook(bookData: BookData) {
            database.bookDao.updateBook(bookData)
    }


    suspend fun deleteBook(bookData: BookData) {
        try {
            database.bookDao.deleteBookById(bookData.id)
        } catch (e: Exception) {
            Log.d(ContentValues.TAG, "Failed to delete from Database: $e")
        }
    }

    suspend fun deleteAllBooks() {
        try {
            database.bookDao.deleteAllBooks()
        } catch (e: Exception) {
            Log.d(ContentValues.TAG, "Failed to delete all from Database: $e")
            }
    }

    fun getBookById(bookId: Long): LiveData<BookData> {
        return database.bookDao.getBookById(bookId)

    }

    suspend fun prepopulate() {
        try {
            for (book in BookExampleData.exampleBooks) {
                database.bookDao.insertBook(book)
            }
        } catch (e: Exception) {
            Log.d(ContentValues.TAG, "Failed to prepopulate Database: $e")
        }
    }

}