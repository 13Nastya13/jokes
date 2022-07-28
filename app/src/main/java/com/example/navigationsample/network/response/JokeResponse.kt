package com.example.navigationsample.network.response

import com.example.navigationsample.network.model.JokeModel
import com.google.gson.annotations.SerializedName

class JokeResponse (
    @SerializedName("categories") val categories: ArrayList<String>?,
    @SerializedName("icon_url") val iconUrl: String?,
    @SerializedName("id") val id: String?,
    @SerializedName("url") val url: String?,
    @SerializedName("value") val value: String?
) {
    fun toModel() = JokeModel(
        categories, iconUrl, id, url, value
    )
}