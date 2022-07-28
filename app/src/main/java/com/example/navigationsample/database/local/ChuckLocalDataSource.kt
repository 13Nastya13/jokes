package com.example.navigationsample.database.local

import androidx.lifecycle.LiveData
import androidx.lifecycle.map
import com.example.navigationsample.database.dao.JokesDao
import com.example.navigationsample.database.entity.JokeEntity
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.lang.Exception

class ChuckLocalDataSource internal constructor(
    private val jokesDao: JokesDao,
    private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO
): IChuckLocalDataSource {

    override fun observeJokes(): LiveData<Result<List<JokeEntity>>> {
        return jokesDao.observeJokes().map {
            Result.success(it)
        }
    }

    override fun observeJoke(jokeId: String): LiveData<Result<JokeEntity>> {
        return jokesDao.observeJokeById(jokeId).map {
            Result.success(it)
        }
    }

    override suspend fun getJokes(): Result<List<JokeEntity>> = withContext(ioDispatcher) {
        return@withContext try {
            Result.success(jokesDao.getJokes())
        } catch (e : Exception) {
            Result.failure(e)
        }
    }

    override suspend fun refreshJokes() {
        TODO("Not yet implemented")
    }

    override suspend fun refreshJoke(jokeId: String) {
        TODO("Not yet implemented")
    }

    override suspend fun getJoke(jokeId: String): Result<JokeEntity> = withContext(ioDispatcher) {
        try {
            val joke = jokesDao.getJokeById(jokeId)
            if (joke != null) {
                return@withContext Result.success(joke)
            } else {
                return@withContext Result.failure(Exception("Task not found!"))
            }
        } catch (e: Exception) {
            return@withContext Result.failure(e)
        }
    }

    override suspend fun saveJoke(joke: JokeEntity) = withContext(ioDispatcher) {
        jokesDao.insertJoke(joke)
    }

    override suspend fun deleteAllJokes() {
        jokesDao.deleteJokes()
    }

    override suspend fun deleteJoke(jokeId: String) {
        jokesDao.deleteJokeById(jokeId)
    }
}