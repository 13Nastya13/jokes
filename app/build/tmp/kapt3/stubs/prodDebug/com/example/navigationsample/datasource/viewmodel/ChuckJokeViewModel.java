package com.example.navigationsample.datasource.viewmodel;

import androidx.lifecycle.*;
import com.example.navigationsample.database.entity.JokeEntity;
import com.example.navigationsample.network.model.JokeModel;
import com.example.navigationsample.repository.impl.ChuckRepositoryImpl;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.lang.Exception;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\fJ\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011J\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00130\fR \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/example/navigationsample/datasource/viewmodel/ChuckJokeViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/navigationsample/repository/impl/ChuckRepositoryImpl;", "(Lcom/example/navigationsample/repository/impl/ChuckRepositoryImpl;)V", "_chuksJokeLiveData", "Lcom/example/navigationsample/datasource/viewmodel/SingleLiveData;", "Lcom/example/navigationsample/datasource/viewmodel/Result;", "Lcom/example/navigationsample/network/model/JokeModel;", "get_chuksJokeLiveData$app_prodDebug", "()Lcom/example/navigationsample/datasource/viewmodel/SingleLiveData;", "getChuksJokeObserver", "Landroidx/lifecycle/LiveData;", "getChurcsJoke", "", "insert", "jokeEntity", "Lcom/example/navigationsample/database/entity/JokeEntity;", "observeAllJokes", "", "app_prodDebug"})
public final class ChuckJokeViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.navigationsample.repository.impl.ChuckRepositoryImpl repository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.navigationsample.datasource.viewmodel.SingleLiveData<com.example.navigationsample.datasource.viewmodel.Result<com.example.navigationsample.network.model.JokeModel>> _chuksJokeLiveData = null;
    
    @javax.inject.Inject()
    public ChuckJokeViewModel(@org.jetbrains.annotations.NotNull()
    com.example.navigationsample.repository.impl.ChuckRepositoryImpl repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.navigationsample.datasource.viewmodel.SingleLiveData<com.example.navigationsample.datasource.viewmodel.Result<com.example.navigationsample.network.model.JokeModel>> get_chuksJokeLiveData$app_prodDebug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.navigationsample.database.entity.JokeEntity>> observeAllJokes() {
        return null;
    }
    
    public final void getChurcsJoke() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.navigationsample.datasource.viewmodel.Result<com.example.navigationsample.network.model.JokeModel>> getChuksJokeObserver() {
        return null;
    }
    
    public final void insert(@org.jetbrains.annotations.NotNull()
    com.example.navigationsample.database.entity.JokeEntity jokeEntity) {
    }
}