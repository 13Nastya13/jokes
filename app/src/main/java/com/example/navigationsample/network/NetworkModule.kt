package com.example.navigationsample.network

import android.content.Context
import androidx.room.Room
import com.example.navigationsample.BuildConfig
import com.example.navigationsample.JokeApp
import com.example.navigationsample.database.LocalDataBase
import com.example.navigationsample.database.dao.JokesDao
import com.example.navigationsample.datasource.remote.ChuckRemoteDataSource
import com.example.navigationsample.repository.IChuckRepository
import com.example.navigationsample.repository.impl.ChuckRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineScope
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.jackson.JacksonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {
    @Provides
    @Singleton
    fun provideRemoteDataSource(api: Api):ChuckRemoteDataSource = ChuckRemoteDataSource(api)

    @Singleton
    @Provides
    fun provideDatabase(@ApplicationContext context: Context):LocalDataBase {
        return Room.databaseBuilder(
            context.applicationContext,
            LocalDataBase::class.java,
            "local_database"
        ).allowMainThreadQueries()
            .build()
    }

    @Provides
    fun provideJokesDao(dataBase: LocalDataBase) : JokesDao {
        return dataBase.jokeDao()
    }

    @Provides
    @Singleton
    fun provideJokeRepository(remoteDataSource: ChuckRemoteDataSource, jokesDao: JokesDao):IChuckRepository=ChuckRepositoryImpl(remoteDataSource, jokesDao)

    @Provides
    @Singleton
    fun provideApiService(retrofit: Retrofit) : Api = retrofit.create(Api::class.java)

    @Provides
    @Singleton
    fun provideRetrofit(gsonConverterFactory : GsonConverterFactory) : Retrofit {
        return Retrofit.Builder()
            .addConverterFactory(gsonConverterFactory)
            .baseUrl(Api.BASE_URL)
            .build()
    }

    @Provides
    @Singleton
    fun provideGsonConverterFactory() : GsonConverterFactory =
        GsonConverterFactory.create()
}