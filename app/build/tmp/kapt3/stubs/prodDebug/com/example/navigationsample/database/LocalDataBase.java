package com.example.navigationsample.database;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.example.navigationsample.database.dao.JokesDao;
import com.example.navigationsample.database.entity.JokeEntity;

@androidx.room.Database(entities = {com.example.navigationsample.database.entity.JokeEntity.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lcom/example/navigationsample/database/LocalDataBase;", "Landroidx/room/RoomDatabase;", "()V", "jokeDao", "Lcom/example/navigationsample/database/dao/JokesDao;", "app_prodDebug"})
public abstract class LocalDataBase extends androidx.room.RoomDatabase {
    
    public LocalDataBase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.navigationsample.database.dao.JokesDao jokeDao();
}