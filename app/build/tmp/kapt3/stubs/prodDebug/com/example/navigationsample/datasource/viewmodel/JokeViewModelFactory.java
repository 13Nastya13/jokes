package com.example.navigationsample.datasource.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.example.navigationsample.repository.IChuckRepository;
import com.example.navigationsample.repository.impl.ChuckRepositoryImpl;
import java.lang.IllegalArgumentException;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u0002H\u0006\"\b\b\u0000\u0010\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\tH\u0016\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/navigationsample/datasource/viewmodel/JokeViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "repository", "Lcom/example/navigationsample/repository/impl/ChuckRepositoryImpl;", "(Lcom/example/navigationsample/repository/impl/ChuckRepositoryImpl;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_prodDebug"})
public final class JokeViewModelFactory implements androidx.lifecycle.ViewModelProvider.Factory {
    private final com.example.navigationsample.repository.impl.ChuckRepositoryImpl repository = null;
    
    @javax.inject.Inject()
    public JokeViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.example.navigationsample.repository.impl.ChuckRepositoryImpl repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> modelClass) {
        return null;
    }
}