package com.example.navigationsample.repository

import androidx.lifecycle.LiveData
import com.example.navigationsample.database.entity.JokeEntity
import com.example.navigationsample.network.model.JokeModel
import com.example.navigationsample.network.response.JokeQueryResponse
import com.example.navigationsample.network.response.JokeResponse

interface IChuckRepository {

    suspend fun getChucksCategories() : ArrayList<String>
    suspend fun getChucksRandom() : JokeModel
    suspend fun getChucksCategory(category : String) : JokeResponse
    suspend fun getChucksSearch(query : String) : JokeQueryResponse
    suspend fun insetr(jokeEntity: JokeEntity)
    suspend fun obeserveJokes() : LiveData<List<JokeEntity>>
}