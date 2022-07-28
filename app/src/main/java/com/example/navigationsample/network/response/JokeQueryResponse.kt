package com.example.navigationsample.network.response

import com.google.gson.annotations.SerializedName

class JokeQueryResponse(
    @SerializedName("total") val total: Long?,
    @SerializedName("result") val result: ArrayList<JokeResponse>?
) {

}