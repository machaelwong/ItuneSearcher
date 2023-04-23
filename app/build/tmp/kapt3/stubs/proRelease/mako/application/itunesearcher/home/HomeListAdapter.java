package mako.application.itunesearcher.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0012\u001a\u00020\bH\u0016J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\bH\u0016J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\bH\u0002J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\bH\u0016J\u0018\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\bH\u0016J\u0010\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\bH\u0016J&\u0010\u001f\u001a\u00020\u00182\u0016\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u0011j\b\u0012\u0004\u0012\u00020\u000f`!2\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\"\u001a\u00020\u0018J\u0006\u0010#\u001a\u00020\u0018J\b\u0010$\u001a\u00020\u0018H\u0002J\u0018\u0010%\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\u000f2\u0006\u0010\'\u001a\u00020\u000fH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lmako/application/itunesearcher/home/HomeListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lmako/application/itunesearcher/listener/OnFavouriteClickedListener;", "c", "Landroid/content/Context;", "(Landroid/content/Context;)V", "CELL_LOADING", "", "CELL_NORMAL", "getC", "()Landroid/content/Context;", "filter", "", "footer", "Lmako/application/itunesearcher/api/Song;", "items", "Ljava/util/ArrayList;", "getItemCount", "getItemViewType", "position", "getSong", "pos", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onFavouriteClicked", "refresh", "response", "Lkotlin/collections/ArrayList;", "reset", "resetFavourite", "setFavourite", "updateFavouriteStorage", "selectedSong", "songFromStorage", "app_proRelease"})
public final class HomeListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> implements mako.application.itunesearcher.listener.OnFavouriteClickedListener {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context c = null;
    private final int CELL_NORMAL = 0;
    private final int CELL_LOADING = 1;
    private java.util.ArrayList<mako.application.itunesearcher.api.Song> items;
    private mako.application.itunesearcher.api.Song footer;
    private java.lang.String filter = "";
    
    public HomeListAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context c) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getC() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @java.lang.Override()
    public void onFavouriteClicked(int position) {
    }
    
    private final void updateFavouriteStorage(mako.application.itunesearcher.api.Song selectedSong, mako.application.itunesearcher.api.Song songFromStorage) {
    }
    
    public final void reset() {
    }
    
    public final void refresh(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<mako.application.itunesearcher.api.Song> response, @org.jetbrains.annotations.NotNull()
    java.lang.String filter) {
    }
    
    public final void resetFavourite() {
    }
    
    private final void setFavourite() {
    }
    
    private final mako.application.itunesearcher.api.Song getSong(int pos) {
        return null;
    }
}