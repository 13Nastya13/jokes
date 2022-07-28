package com.example.navigationsample.network;

import android.content.Context;
import androidx.room.Room;
import com.example.navigationsample.BuildConfig;
import com.example.navigationsample.JokeApp;
import com.example.navigationsample.database.LocalDataBase;
import com.example.navigationsample.database.dao.JokesDao;
import com.example.navigationsample.datasource.remote.ChuckRemoteDataSource;
import com.example.navigationsample.repository.IChuckRepository;
import com.example.navigationsample.repository.impl.ChuckRepositoryImpl;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.jackson.JacksonConverterFactory;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\fH\u0007J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\bH\u0007J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0004H\u0007J\u0010\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\fH\u0007\u00a8\u0006\u0019"}, d2 = {"Lcom/example/navigationsample/network/NetworkModule;", "", "()V", "provideApiService", "Lcom/example/navigationsample/network/Api;", "retrofit", "Lretrofit2/Retrofit;", "provideDatabase", "Lcom/example/navigationsample/database/LocalDataBase;", "context", "Landroid/content/Context;", "provideGsonConverterFactory", "Lretrofit2/converter/gson/GsonConverterFactory;", "provideJokeRepository", "Lcom/example/navigationsample/repository/IChuckRepository;", "remoteDataSource", "Lcom/example/navigationsample/datasource/remote/ChuckRemoteDataSource;", "jokesDao", "Lcom/example/navigationsample/database/dao/JokesDao;", "provideJokesDao", "dataBase", "provideRemoteDataSource", "api", "provideRetrofit", "gsonConverterFactory", "app_prodDebug"})
@dagger.Module()
public final class NetworkModule {
    
    public NetworkModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.navigationsample.datasource.remote.ChuckRemoteDataSource provideRemoteDataSource(@org.jetbrains.annotations.NotNull()
    com.example.navigationsample.network.Api api) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.example.navigationsample.database.LocalDataBase provideDatabase(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.navigationsample.database.dao.JokesDao provideJokesDao(@org.jetbrains.annotations.NotNull()
    com.example.navigationsample.database.LocalDataBase dataBase) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.navigationsample.repository.IChuckRepository provideJokeRepository(@org.jetbrains.annotations.NotNull()
    com.example.navigationsample.datasource.remote.ChuckRemoteDataSource remoteDataSource, @org.jetbrains.annotations.NotNull()
    com.example.navigationsample.database.dao.JokesDao jokesDao) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.navigationsample.network.Api provideApiService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final retrofit2.Retrofit provideRetrofit(@org.jetbrains.annotations.NotNull()
    retrofit2.converter.gson.GsonConverterFactory gsonConverterFactory) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final retrofit2.converter.gson.GsonConverterFactory provideGsonConverterFactory() {
        return null;
    }
}