package com.example.navigationsample.database.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;
import com.example.navigationsample.database.entity.JokeEntity;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\rH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00122\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\r0\u0012H\'J\u0019\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/example/navigationsample/database/dao/JokesDao;", "", "deleteJokeById", "", "jokeId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteJokes", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getJokeById", "Lcom/example/navigationsample/database/entity/JokeEntity;", "getJokes", "", "insertJoke", "joke", "(Lcom/example/navigationsample/database/entity/JokeEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "observeJokeById", "Landroidx/lifecycle/LiveData;", "observeJokes", "updateJoke", "app_prodDebug"})
public abstract interface JokesDao {
    
    /**
     * Observes list of jokes.
     *
     * @return all jokes.
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM chucks_jokes")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.navigationsample.database.entity.JokeEntity>> observeJokes();
    
    /**
     * Observes a single joke.
     *
     * @param jokeId the joke id.
     * @return the joke with jokeId.
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM chucks_jokes WHERE entryid = :jokeId")
    public abstract androidx.lifecycle.LiveData<com.example.navigationsample.database.entity.JokeEntity> observeJokeById(@org.jetbrains.annotations.NotNull()
    java.lang.String jokeId);
    
    /**
     * Select all jokes from the chucks_jokes table.
     *
     * @return all jokes.
     */
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM chucks_jokes")
    public abstract java.lang.Object getJokes(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.navigationsample.database.entity.JokeEntity>> continuation);
    
    /**
     * Select a task by id.
     *
     * @param jokeId the joke id.
     * @return the joke with jokeId.
     */
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM chucks_jokes WHERE entryid = :jokeId")
    public abstract java.lang.Object getJokeById(@org.jetbrains.annotations.NotNull()
    java.lang.String jokeId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.navigationsample.database.entity.JokeEntity> continuation);
    
    /**
     * Insert a joke in the database. If the task already exists, replace it.
     *
     * @param task the task to be inserted.
     */
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract java.lang.Object insertJoke(@org.jetbrains.annotations.NotNull()
    com.example.navigationsample.database.entity.JokeEntity joke, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    /**
     * Update a task.
     *
     * @param joke joke to be updated
     * @return the number of joke updated. This should always be 1.
     */
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Update()
    public abstract java.lang.Object updateJoke(@org.jetbrains.annotations.NotNull()
    com.example.navigationsample.database.entity.JokeEntity joke, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> continuation);
    
    /**
     * Delete a joke by id.
     *
     * @return the number of jokes deleted. This should always be 1.
     */
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM chucks_jokes WHERE entryid = :jokeId")
    public abstract java.lang.Object deleteJokeById(@org.jetbrains.annotations.NotNull()
    java.lang.String jokeId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> continuation);
    
    /**
     * Delete all jokes.
     */
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM chucks_jokes")
    public abstract java.lang.Object deleteJokes(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}