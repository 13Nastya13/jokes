package com.example.navigationsample.datasource.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.navigationsample.repository.IChuckRepository
import com.example.navigationsample.repository.impl.ChuckRepositoryImpl
import java.lang.IllegalArgumentException
import javax.inject.Inject

class JokeViewModelFactory @Inject constructor(private val repository: ChuckRepositoryImpl) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ChuckJokeViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return ChuckJokeViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}