package com.example.app_sql.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.app_sql.data.datamodels.BookData

@Database(entities = [BookData::class], version = 1)
abstract class BookDatabase : RoomDatabase() {
    abstract val bookDao: BookDao
}

private lateinit var INSTANCE: BookDatabase

fun getDatabase(context: Context): BookDatabase {
    synchronized(BookDatabase::class.java) {
        if (!::INSTANCE.isInitialized) {
            INSTANCE = Room.databaseBuilder(
                context.applicationContext,
                BookDatabase::class.java,
                "book_database"
            )
                .build()
        }
    }
    return INSTANCE
}

