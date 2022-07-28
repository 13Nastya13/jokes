package com.example.navigationsample.network.response;

import com.google.gson.annotations.SerializedName;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007\u00a2\u0006\u0002\u0010\bR*\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u000e"}, d2 = {"Lcom/example/navigationsample/network/response/JokeQueryResponse;", "", "total", "", "result", "Ljava/util/ArrayList;", "Lcom/example/navigationsample/network/response/JokeResponse;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/Long;Ljava/util/ArrayList;)V", "getResult", "()Ljava/util/ArrayList;", "getTotal", "()Ljava/lang/Long;", "Ljava/lang/Long;", "app_prodDebug"})
public final class JokeQueryResponse {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "total")
    private final java.lang.Long total = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "result")
    private final java.util.ArrayList<com.example.navigationsample.network.response.JokeResponse> result = null;
    
    public JokeQueryResponse(@org.jetbrains.annotations.Nullable()
    java.lang.Long total, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.example.navigationsample.network.response.JokeResponse> result) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getTotal() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.example.navigationsample.network.response.JokeResponse> getResult() {
        return null;
    }
}