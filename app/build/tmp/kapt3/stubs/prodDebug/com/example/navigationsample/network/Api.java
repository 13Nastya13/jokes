package com.example.navigationsample.network;

import com.example.navigationsample.network.response.JokeQueryResponse;
import com.example.navigationsample.network.response.JokeResponse;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001b\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0011\u0010\u000b\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001b\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/example/navigationsample/network/Api;", "", "getChucksCategories", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getChucksCategory", "Lcom/example/navigationsample/network/response/JokeResponse;", "category", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getChucksRandom", "getChucksSearch", "Lcom/example/navigationsample/network/response/JokeQueryResponse;", "query", "Companion", "app_prodDebug"})
public abstract interface Api {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.navigationsample.network.Api.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "categories")
    public abstract java.lang.Object getChucksCategories(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.ArrayList<java.lang.String>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "random")
    public abstract java.lang.Object getChucksRandom(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.navigationsample.network.response.JokeResponse> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "random?category={category}")
    public abstract java.lang.Object getChucksCategory(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "category")
    java.lang.String category, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.navigationsample.network.response.JokeResponse> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "search?query={query}")
    public abstract java.lang.Object getChucksSearch(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "query")
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.navigationsample.network.response.JokeQueryResponse> continuation);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/example/navigationsample/network/Api$Companion;", "", "()V", "BASE_URL", "", "getBASE_URL", "()Ljava/lang/String;", "setBASE_URL", "(Ljava/lang/String;)V", "EP_CHUCKS_CATEGORIES", "EP_CHUCKS_CATEGORY", "EP_CHUCKS_RANDOM", "EP_CHUCKS_SEARCH", "EP_JOKES", "app_prodDebug"})
    public static final class Companion {
        private static final java.lang.String EP_JOKES = "https://icanhazdadjoke.com/";
        private static final java.lang.String EP_CHUCKS_RANDOM = "random";
        private static final java.lang.String EP_CHUCKS_CATEGORIES = "categories";
        private static final java.lang.String EP_CHUCKS_CATEGORY = "random?category={category}";
        private static final java.lang.String EP_CHUCKS_SEARCH = "search?query={query}";
        @org.jetbrains.annotations.NotNull()
        private static java.lang.String BASE_URL = "https://api.chucknorris.io/jokes/";
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getBASE_URL() {
            return null;
        }
        
        public final void setBASE_URL(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
    }
}