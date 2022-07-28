package com.example.navigationsample.repository;

import androidx.lifecycle.LiveData;
import com.example.navigationsample.database.entity.JokeEntity;
import com.example.navigationsample.network.model.JokeModel;
import com.example.navigationsample.network.response.JokeQueryResponse;
import com.example.navigationsample.network.response.JokeResponse;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0011\u0010\u000b\u001a\u00020\fH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0019\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u001d\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00170\u0016H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0018"}, d2 = {"Lcom/example/navigationsample/repository/IChuckRepository;", "", "getChucksCategories", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getChucksCategory", "Lcom/example/navigationsample/network/response/JokeResponse;", "category", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getChucksRandom", "Lcom/example/navigationsample/network/model/JokeModel;", "getChucksSearch", "Lcom/example/navigationsample/network/response/JokeQueryResponse;", "query", "insetr", "", "jokeEntity", "Lcom/example/navigationsample/database/entity/JokeEntity;", "(Lcom/example/navigationsample/database/entity/JokeEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "obeserveJokes", "Landroidx/lifecycle/LiveData;", "", "app_prodDebug"})
public abstract interface IChuckRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getChucksCategories(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.ArrayList<java.lang.String>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getChucksRandom(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.navigationsample.network.model.JokeModel> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getChucksCategory(@org.jetbrains.annotations.NotNull()
    java.lang.String category, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.navigationsample.network.response.JokeResponse> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getChucksSearch(@org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.navigationsample.network.response.JokeQueryResponse> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insetr(@org.jetbrains.annotations.NotNull()
    com.example.navigationsample.database.entity.JokeEntity jokeEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object obeserveJokes(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<java.util.List<com.example.navigationsample.database.entity.JokeEntity>>> continuation);
}