package com.example.navigationsample.database.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.example.navigationsample.network.model.JokeModel;
import java.util.UUID;

@androidx.room.Entity(tableName = "chucks_jokes")
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\bJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J;\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u000e\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020&J\t\u0010\'\u001a\u00020(H\u00d6\u0001J\t\u0010)\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\t\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000b\"\u0004\b\u0012\u0010\u0010R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000b\"\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0015\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u000bR\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000b\"\u0004\b\u0018\u0010\u0010R\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000b\"\u0004\b\u001a\u0010\u0010\u00a8\u0006*"}, d2 = {"Lcom/example/navigationsample/database/entity/JokeEntity;", "", "iconUrl", "", "jokeId", "url", "value", "id", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "description", "getDescription", "()Ljava/lang/String;", "icon", "getIcon", "getIconUrl", "setIconUrl", "(Ljava/lang/String;)V", "getId", "setId", "getJokeId", "setJokeId", "title", "getTitle", "getUrl", "setUrl", "getValue", "setValue", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "fromModel", "jokeModel", "Lcom/example/navigationsample/network/model/JokeModel;", "hashCode", "", "toString", "app_prodDebug"})
public final class JokeEntity {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "icon_url")
    private java.lang.String iconUrl;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "jokeid")
    private java.lang.String jokeId;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "url")
    private java.lang.String url;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "value")
    private java.lang.String value;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "entryid")
    @androidx.room.PrimaryKey()
    private java.lang.String id;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.navigationsample.database.entity.JokeEntity copy(@org.jetbrains.annotations.NotNull()
    java.lang.String iconUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String jokeId, @org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    java.lang.String value, @org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @kotlin.jvm.JvmOverloads()
    public JokeEntity() {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public JokeEntity(@org.jetbrains.annotations.NotNull()
    java.lang.String iconUrl) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public JokeEntity(@org.jetbrains.annotations.NotNull()
    java.lang.String iconUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String jokeId) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public JokeEntity(@org.jetbrains.annotations.NotNull()
    java.lang.String iconUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String jokeId, @org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public JokeEntity(@org.jetbrains.annotations.NotNull()
    java.lang.String iconUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String jokeId, @org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    java.lang.String value) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public JokeEntity(@org.jetbrains.annotations.NotNull()
    java.lang.String iconUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String jokeId, @org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    java.lang.String value, @org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIconUrl() {
        return null;
    }
    
    public final void setIconUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getJokeId() {
        return null;
    }
    
    public final void setJokeId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUrl() {
        return null;
    }
    
    public final void setUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getValue() {
        return null;
    }
    
    public final void setValue(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIcon() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.navigationsample.database.entity.JokeEntity fromModel(@org.jetbrains.annotations.NotNull()
    com.example.navigationsample.network.model.JokeModel jokeModel) {
        return null;
    }
}