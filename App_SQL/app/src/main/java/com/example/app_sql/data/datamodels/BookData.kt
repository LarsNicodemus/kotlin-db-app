package com.example.app_sql.data.datamodels

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "book_table")
class BookData (
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val title: String,
    val author: String,
    val genre: String,
    var finished: Boolean = false,
    var wantToRead: Boolean = false,
    var isReading: Boolean = false,
    var review: Int = 0,
    var note: String?,
    val image: Int
)

