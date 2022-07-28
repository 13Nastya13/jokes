package com.example.navigationsample

import android.app.Application
import com.example.navigationsample.database.LocalDataBase
import com.example.navigationsample.datasource.remote.ChuckRemoteDataSource
import com.example.navigationsample.repository.impl.ChuckRepositoryImpl
import dagger.hilt.android.HiltAndroidApp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob

@HiltAndroidApp
class JokeApp : Application() {
    val applicationScope = CoroutineScope(SupervisorJob())
//    val database by lazy { LocalDataBase.getDatabase(this, applicationScope) }
//    val repository by lazy { ChuckRepositoryImpl(ChuckRemoteDataSource(), database.jokeDao()) }
}