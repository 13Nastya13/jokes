package com.example.navigationsample.database.local

import androidx.lifecycle.LiveData
import com.example.navigationsample.database.entity.JokeEntity

interface IChuckLocalDataSource {

    fun observeJokes(): LiveData<Result<List<JokeEntity>>>

    suspend fun getJokes(): Result<List<JokeEntity>>

    suspend fun refreshJokes()

    fun observeJoke(jokeId: String): LiveData<Result<JokeEntity>>

    suspend fun getJoke(jokeId: String): Result<JokeEntity>

    suspend fun refreshJoke(jokeId: String)

    suspend fun saveJoke(joke: JokeEntity)

    suspend fun deleteAllJokes()

    suspend fun deleteJoke(jokeId: String)
}