package com.example.navigationsample.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.navigationsample.database.dao.JokesDao
import com.example.navigationsample.database.entity.JokeEntity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Database(entities = [JokeEntity::class], version = 1, exportSchema = false)
public abstract class LocalDataBase: RoomDatabase() {
    abstract fun jokeDao(): JokesDao
}