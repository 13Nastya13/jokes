package com.example.navigationsample.datasource.remote

import com.example.navigationsample.network.Api
import com.example.navigationsample.network.response.JokeQueryResponse
import com.example.navigationsample.network.response.JokeResponse
import javax.inject.Inject

open class ChuckRemoteDataSource @Inject constructor (private val api: Api){

    open suspend fun getChucksCategories() : ArrayList<String> {
        return api.getChucksCategories()
    }

    open suspend fun getChucksRandom() : JokeResponse {
        return api.getChucksRandom()
    }

    open suspend fun getChucksCategory(category : String) : JokeResponse {
        return api.getChucksCategory(category)
    }

    open suspend fun getChucksSearch(query : String) : JokeQueryResponse {
        return api.getChucksSearch(query)
    }
}