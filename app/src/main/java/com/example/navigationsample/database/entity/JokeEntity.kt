package com.example.navigationsample.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.navigationsample.network.model.JokeModel
import java.util.UUID

@Entity(tableName = "chucks_jokes")
data class JokeEntity @JvmOverloads constructor(
//    @ColumnInfo(name = "categories") var categories: ArrayList<String>?,
    @ColumnInfo(name = "icon_url") var iconUrl: String = "",
    @ColumnInfo(name = "jokeid") var jokeId: String = "",
    @ColumnInfo(name = "url") var url: String = "",
    @ColumnInfo(name = "value") var value: String = "",
    @PrimaryKey @ColumnInfo(name = "entryid") var id: String = UUID.randomUUID().toString()
) {

    val title: String
        get() = jokeId

    val description
        get() = value

    val icon
        get() = iconUrl

    public fun fromModel(jokeModel: JokeModel) : JokeEntity {
        val jokeEntity = JokeEntity()
        jokeEntity.value = jokeModel.value.toString()
        jokeEntity.url = jokeModel.url.toString()
        jokeEntity.jokeId = jokeModel.id.toString()
        jokeEntity.iconUrl = jokeModel.iconUrl.toString()
        return jokeEntity
    }
}