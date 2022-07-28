package com.example.navigationsample.datasource.viewmodel

import androidx.lifecycle.*
import com.example.navigationsample.database.entity.JokeEntity
import com.example.navigationsample.network.model.JokeModel
import com.example.navigationsample.repository.impl.ChuckRepositoryImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.launch
import java.lang.Exception
import javax.inject.Inject

@HiltViewModel
class ChuckJokeViewModel @Inject constructor(private val repository : ChuckRepositoryImpl) : ViewModel() {

    internal val _chuksJokeLiveData = SingleLiveData<Result<JokeModel>>()

    fun observeAllJokes() : LiveData<List<JokeEntity>>{
        return repository.allJokes
    }

    fun getChurcsJoke() {
        viewModelScope.launch( CoroutineExceptionHandler {_, throwable ->
            _chuksJokeLiveData.postValue(Result.Error(Exception(throwable.message)))
        }) {
            val data = repository.getChucksRandom();
            insert(JokeEntity().fromModel(data))
            _chuksJokeLiveData.postValue(Result.Success(data))
        }
    }

    fun getChuksJokeObserver(): LiveData<Result<JokeModel>> {
        return _chuksJokeLiveData
    }

    fun insert(jokeEntity: JokeEntity) {
        viewModelScope.launch {
            repository.insetr(jokeEntity)
        }
    }

}