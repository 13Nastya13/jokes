package com.example.navigationsample.ui.control;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.example.navigationsample.database.entity.JokeEntity;
import com.example.navigationsample.databinding.ItemJokeBinding;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016J\u001e\u0010\u0015\u001a\u00020\u000e2\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0017R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u0019"}, d2 = {"Lcom/example/navigationsample/ui/control/JokeEntityAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/navigationsample/ui/control/JokeEntityAdapter$ViewHolder;", "()V", "items_", "Ljava/util/ArrayList;", "Lcom/example/navigationsample/database/entity/JokeEntity;", "getItems_", "()Ljava/util/ArrayList;", "setItems_", "(Ljava/util/ArrayList;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setItems", "data", "Lkotlin/collections/ArrayList;", "ViewHolder", "app_prodDebug"})
public final class JokeEntityAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.navigationsample.ui.control.JokeEntityAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.example.navigationsample.database.entity.JokeEntity> items_;
    
    public JokeEntityAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.navigationsample.database.entity.JokeEntity> getItems_() {
        return null;
    }
    
    public final void setItems_(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.navigationsample.database.entity.JokeEntity> p0) {
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.navigationsample.database.entity.JokeEntity> data) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.navigationsample.ui.control.JokeEntityAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.navigationsample.ui.control.JokeEntityAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/example/navigationsample/ui/control/JokeEntityAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/navigationsample/databinding/ItemJokeBinding;", "(Lcom/example/navigationsample/databinding/ItemJokeBinding;)V", "getBinding", "()Lcom/example/navigationsample/databinding/ItemJokeBinding;", "bind", "", "joke", "Lcom/example/navigationsample/database/entity/JokeEntity;", "app_prodDebug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.example.navigationsample.databinding.ItemJokeBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.navigationsample.databinding.ItemJokeBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.navigationsample.databinding.ItemJokeBinding getBinding() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.navigationsample.database.entity.JokeEntity joke) {
        }
    }
}