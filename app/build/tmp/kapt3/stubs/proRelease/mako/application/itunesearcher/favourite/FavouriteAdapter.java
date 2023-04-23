package mako.application.itunesearcher.favourite;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010!\u001a\u00020\"H\u0016J\u0018\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\"H\u0016J\u0018\u0010\'\u001a\u00020\u00022\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\"H\u0016J\u0010\u0010+\u001a\u00020$2\u0006\u0010&\u001a\u00020\"H\u0016J\u001e\u0010,\u001a\u00020$2\u0016\u0010-\u001a\u0012\u0012\u0004\u0012\u00020\u001b0\u001aj\b\u0012\u0004\u0012\u00020\u001b`\u001cR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R*\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u001b0\u001aj\b\u0012\u0004\u0012\u00020\u001b`\u001cX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u00a8\u0006."}, d2 = {"Lmako/application/itunesearcher/favourite/FavouriteAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lmako/application/itunesearcher/home/DetailsHolder;", "Lmako/application/itunesearcher/listener/OnFavouriteClickedListener;", "c", "Landroid/content/Context;", "model", "Lmako/application/itunesearcher/home/HomeViewModel;", "(Landroid/content/Context;Lmako/application/itunesearcher/home/HomeViewModel;)V", "builder", "Landroidx/appcompat/app/AlertDialog$Builder;", "getBuilder", "()Landroidx/appcompat/app/AlertDialog$Builder;", "setBuilder", "(Landroidx/appcompat/app/AlertDialog$Builder;)V", "getC", "()Landroid/content/Context;", "dialog", "Landroidx/appcompat/app/AlertDialog;", "getDialog", "()Landroidx/appcompat/app/AlertDialog;", "setDialog", "(Landroidx/appcompat/app/AlertDialog;)V", "getModel", "()Lmako/application/itunesearcher/home/HomeViewModel;", "songs", "Ljava/util/ArrayList;", "Lmako/application/itunesearcher/api/Song;", "Lkotlin/collections/ArrayList;", "getSongs", "()Ljava/util/ArrayList;", "setSongs", "(Ljava/util/ArrayList;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onFavouriteClicked", "refresh", "storage", "app_proRelease"})
public final class FavouriteAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<mako.application.itunesearcher.home.DetailsHolder> implements mako.application.itunesearcher.listener.OnFavouriteClickedListener {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context c = null;
    @org.jetbrains.annotations.NotNull()
    private final mako.application.itunesearcher.home.HomeViewModel model = null;
    public java.util.ArrayList<mako.application.itunesearcher.api.Song> songs;
    @org.jetbrains.annotations.Nullable()
    private androidx.appcompat.app.AlertDialog dialog;
    @org.jetbrains.annotations.NotNull()
    private androidx.appcompat.app.AlertDialog.Builder builder;
    
    public FavouriteAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context c, @org.jetbrains.annotations.NotNull()
    mako.application.itunesearcher.home.HomeViewModel model) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getC() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final mako.application.itunesearcher.home.HomeViewModel getModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<mako.application.itunesearcher.api.Song> getSongs() {
        return null;
    }
    
    public final void setSongs(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<mako.application.itunesearcher.api.Song> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.appcompat.app.AlertDialog getDialog() {
        return null;
    }
    
    public final void setDialog(@org.jetbrains.annotations.Nullable()
    androidx.appcompat.app.AlertDialog p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.appcompat.app.AlertDialog.Builder getBuilder() {
        return null;
    }
    
    public final void setBuilder(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AlertDialog.Builder p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public mako.application.itunesearcher.home.DetailsHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    mako.application.itunesearcher.home.DetailsHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onFavouriteClicked(int position) {
    }
    
    public final void refresh(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<mako.application.itunesearcher.api.Song> storage) {
    }
}