package com.example.navigationsample.network

import com.example.navigationsample.network.response.JokeQueryResponse
import com.example.navigationsample.network.response.JokeResponse
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path

interface Api {

    @GET(EP_CHUCKS_CATEGORIES)
    suspend fun getChucksCategories() : ArrayList<String>

    @GET(EP_CHUCKS_RANDOM)
    suspend fun getChucksRandom() : JokeResponse

    @GET(EP_CHUCKS_CATEGORY)
    suspend fun getChucksCategory(@Path("category") category: String) : JokeResponse

    @GET(EP_CHUCKS_SEARCH)
    suspend fun getChucksSearch(@Path("query") query: String) : JokeQueryResponse

    companion object {
        private const val EP_JOKES = "https://icanhazdadjoke.com/"

        private const val EP_CHUCKS_RANDOM = "random"
        private const val EP_CHUCKS_CATEGORIES = "categories"
        private const val EP_CHUCKS_CATEGORY = "random?category={category}"
        private const val EP_CHUCKS_SEARCH = "search?query={query}"

        var BASE_URL = "https://api.chucknorris.io/jokes/"
    }
}