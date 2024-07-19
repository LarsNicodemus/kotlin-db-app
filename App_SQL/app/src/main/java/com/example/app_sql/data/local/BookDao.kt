package com.example.app_sql.data.local

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.app_sql.data.datamodels.BookData

@Dao
interface BookDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertBook(book: BookData)

    @Update
    suspend fun updateBook(book: BookData)

    @Query("SELECT * FROM book_table")
    fun getAllBooks(): LiveData<List<BookData>>

    @Query("SELECT * FROM book_table WHERE id = :id")
    fun getBookById(id: Long): LiveData<BookData>

    @Query("DELETE FROM book_table WHERE id = :id")
    suspend fun deleteBookById(id: Long)

    @Query("DELETE FROM book_table")
    suspend fun deleteAllBooks()

    @Query("SELECT COUNT(*) FROM book_table")
    fun getBookCount(): Int

}