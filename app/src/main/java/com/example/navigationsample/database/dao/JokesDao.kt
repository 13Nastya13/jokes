package com.example.navigationsample.database.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.navigationsample.database.entity.JokeEntity

@Dao
interface JokesDao {

    /**
     * Observes list of jokes.
     *
     * @return all jokes.
     */
    @Query("SELECT * FROM chucks_jokes")
    fun observeJokes(): LiveData<List<JokeEntity>>

    /**
     * Observes a single joke.
     *
     * @param jokeId the joke id.
     * @return the joke with jokeId.
     */
    @Query("SELECT * FROM chucks_jokes WHERE entryid = :jokeId")
    fun observeJokeById(jokeId: String): LiveData<JokeEntity>

    /**
     * Select all jokes from the chucks_jokes table.
     *
     * @return all jokes.
     */
    @Query("SELECT * FROM chucks_jokes")
    suspend fun getJokes(): List<JokeEntity>

    /**
     * Select a task by id.
     *
     * @param jokeId the joke id.
     * @return the joke with jokeId.
     */
    @Query("SELECT * FROM chucks_jokes WHERE entryid = :jokeId")
    suspend fun getJokeById(jokeId: String): JokeEntity?

    /**
     * Insert a joke in the database. If the task already exists, replace it.
     *
     * @param task the task to be inserted.
     */
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertJoke(joke: JokeEntity)

    /**
     * Update a task.
     *
     * @param joke joke to be updated
     * @return the number of joke updated. This should always be 1.
     */
    @Update
    suspend fun updateJoke(joke: JokeEntity): Int

    /**
     * Delete a joke by id.
     *
     * @return the number of jokes deleted. This should always be 1.
     */
    @Query("DELETE FROM chucks_jokes WHERE entryid = :jokeId")
    suspend fun deleteJokeById(jokeId: String): Int

    /**
     * Delete all jokes.
     */
    @Query("DELETE FROM chucks_jokes")
    suspend fun deleteJokes()
}