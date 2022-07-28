package com.example.navigationsample.repository.impl

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import com.example.navigationsample.database.dao.JokesDao
import com.example.navigationsample.database.entity.JokeEntity
import com.example.navigationsample.datasource.remote.ChuckRemoteDataSource
import com.example.navigationsample.network.model.JokeModel
import com.example.navigationsample.network.response.JokeQueryResponse
import com.example.navigationsample.network.response.JokeResponse
import com.example.navigationsample.repository.IChuckRepository
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import javax.inject.Inject

class ChuckRepositoryImpl @Inject constructor(private val remoteDataSource: ChuckRemoteDataSource , val jokesDao: JokesDao) : IChuckRepository {

    val allJokes: LiveData<List<JokeEntity>> = jokesDao.observeJokes()

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    override suspend fun insetr(jokeEntity: JokeEntity) {
        jokesDao.insertJoke(jokeEntity)
    }

    override suspend fun obeserveJokes(): LiveData<List<JokeEntity>> {
        return allJokes
    }

    override suspend fun getChucksCategories(): ArrayList<String> {
        TODO("Not yet implemented")
    }

    override suspend fun getChucksRandom(): JokeModel {
        return remoteDataSource.getChucksRandom().toModel()
    }

    override suspend fun getChucksCategory(category: String): JokeResponse {
        TODO("Not yet implemented")
    }

    override suspend fun getChucksSearch(query: String): JokeQueryResponse {
        TODO("Not yet implemented")
    }
}