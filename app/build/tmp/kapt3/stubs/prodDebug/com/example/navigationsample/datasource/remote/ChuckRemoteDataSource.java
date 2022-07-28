package com.example.navigationsample.datasource.remote;

import com.example.navigationsample.network.Api;
import com.example.navigationsample.network.response.JokeQueryResponse;
import com.example.navigationsample.network.response.JokeResponse;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J!\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0011\u0010\u000e\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0007H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/example/navigationsample/datasource/remote/ChuckRemoteDataSource;", "", "api", "Lcom/example/navigationsample/network/Api;", "(Lcom/example/navigationsample/network/Api;)V", "getChucksCategories", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getChucksCategory", "Lcom/example/navigationsample/network/response/JokeResponse;", "category", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getChucksRandom", "getChucksSearch", "Lcom/example/navigationsample/network/response/JokeQueryResponse;", "query", "app_prodDebug"})
public class ChuckRemoteDataSource {
    private final com.example.navigationsample.network.Api api = null;
    
    @javax.inject.Inject()
    public ChuckRemoteDataSource(@org.jetbrains.annotations.NotNull()
    com.example.navigationsample.network.Api api) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getChucksCategories(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.ArrayList<java.lang.String>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getChucksRandom(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.navigationsample.network.response.JokeResponse> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getChucksCategory(@org.jetbrains.annotations.NotNull()
    java.lang.String category, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.navigationsample.network.response.JokeResponse> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getChucksSearch(@org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.navigationsample.network.response.JokeQueryResponse> continuation) {
        return null;
    }
}