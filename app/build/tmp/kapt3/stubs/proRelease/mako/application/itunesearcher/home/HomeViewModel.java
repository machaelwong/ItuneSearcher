package mako.application.itunesearcher.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006J\u001e\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0006R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lmako/application/itunesearcher/home/HomeViewModel;", "Lmako/application/itunesearcher/base/BaseViewModel;", "Lmako/application/itunesearcher/api/SearchResult;", "()V", "_isFavouriteRemoved", "Landroidx/lifecycle/MutableLiveData;", "", "isFavouriteRemoved", "Landroidx/lifecycle/LiveData;", "offset", "", "onFavouriteRemoved", "", "values", "search", "key", "", "filter", "resetOffset", "app_proRelease"})
public final class HomeViewModel extends mako.application.itunesearcher.base.BaseViewModel<mako.application.itunesearcher.api.SearchResult> {
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isFavouriteRemoved = null;
    private final androidx.lifecycle.LiveData<java.lang.Boolean> isFavouriteRemoved = null;
    private int offset = 0;
    
    public HomeViewModel() {
        super();
    }
    
    @kotlin.jvm.Synchronized()
    public final synchronized void search(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String filter, boolean resetOffset) {
    }
    
    public final void onFavouriteRemoved(boolean values) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isFavouriteRemoved() {
        return null;
    }
}