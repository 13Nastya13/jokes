package com.example.navigationsample.repository.impl;

import androidx.annotation.WorkerThread;
import androidx.lifecycle.LiveData;
import com.example.navigationsample.database.dao.JokesDao;
import com.example.navigationsample.database.entity.JokeEntity;
import com.example.navigationsample.datasource.remote.ChuckRemoteDataSource;
import com.example.navigationsample.network.model.JokeModel;
import com.example.navigationsample.network.response.JokeQueryResponse;
import com.example.navigationsample.network.response.JokeResponse;
import com.example.navigationsample.repository.IChuckRepository;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J!\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u0012H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u0011\u0010\u0018\u001a\u00020\u0019H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\nH\u0097@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 J\u001d\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\""}, d2 = {"Lcom/example/navigationsample/repository/impl/ChuckRepositoryImpl;", "Lcom/example/navigationsample/repository/IChuckRepository;", "remoteDataSource", "Lcom/example/navigationsample/datasource/remote/ChuckRemoteDataSource;", "jokesDao", "Lcom/example/navigationsample/database/dao/JokesDao;", "(Lcom/example/navigationsample/datasource/remote/ChuckRemoteDataSource;Lcom/example/navigationsample/database/dao/JokesDao;)V", "allJokes", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/navigationsample/database/entity/JokeEntity;", "getAllJokes", "()Landroidx/lifecycle/LiveData;", "getJokesDao", "()Lcom/example/navigationsample/database/dao/JokesDao;", "getChucksCategories", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getChucksCategory", "Lcom/example/navigationsample/network/response/JokeResponse;", "category", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getChucksRandom", "Lcom/example/navigationsample/network/model/JokeModel;", "getChucksSearch", "Lcom/example/navigationsample/network/response/JokeQueryResponse;", "query", "insetr", "", "jokeEntity", "(Lcom/example/navigationsample/database/entity/JokeEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "obeserveJokes", "app_prodDebug"})
public final class ChuckRepositoryImpl implements com.example.navigationsample.repository.IChuckRepository {
    private final com.example.navigationsample.datasource.remote.ChuckRemoteDataSource remoteDataSource = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.navigationsample.database.dao.JokesDao jokesDao = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.navigationsample.database.entity.JokeEntity>> allJokes = null;
    
    @javax.inject.Inject()
    public ChuckRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.example.navigationsample.datasource.remote.ChuckRemoteDataSource remoteDataSource, @org.jetbrains.annotations.NotNull()
    com.example.navigationsample.database.dao.JokesDao jokesDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.navigationsample.database.dao.JokesDao getJokesDao() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.navigationsample.database.entity.JokeEntity>> getAllJokes() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.WorkerThread()
    @kotlin.Suppress(names = {"RedundantSuspendModifier"})
    @java.lang.Override()
    public java.lang.Object insetr(@org.jetbrains.annotations.NotNull()
    com.example.navigationsample.database.entity.JokeEntity jokeEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object obeserveJokes(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<java.util.List<com.example.navigationsample.database.entity.JokeEntity>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getChucksCategories(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.ArrayList<java.lang.String>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getChucksRandom(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.navigationsample.network.model.JokeModel> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getChucksCategory(@org.jetbrains.annotations.NotNull()
    java.lang.String category, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.navigationsample.network.response.JokeResponse> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getChucksSearch(@org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.navigationsample.network.response.JokeQueryResponse> continuation) {
        return null;
    }
}