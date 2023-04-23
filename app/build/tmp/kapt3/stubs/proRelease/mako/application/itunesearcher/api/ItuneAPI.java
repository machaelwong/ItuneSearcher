package mako.application.itunesearcher.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0004R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0013"}, d2 = {"Lmako/application/itunesearcher/api/ItuneAPI;", "", "()V", "REQUEST_LIMIT", "", "getREQUEST_LIMIT", "()I", "service", "Lmako/application/itunesearcher/api/ItuneAPI$ItunesApiService;", "getService", "()Lmako/application/itunesearcher/api/ItuneAPI$ItunesApiService;", "search", "Lio/reactivex/Observable;", "Lmako/application/itunesearcher/api/SearchResult;", "keyword", "", "filter", "offset", "ItunesApiService", "app_proRelease"})
public final class ItuneAPI {
    @org.jetbrains.annotations.NotNull()
    public static final mako.application.itunesearcher.api.ItuneAPI INSTANCE = null;
    private static final int REQUEST_LIMIT = 20;
    
    private ItuneAPI() {
        super();
    }
    
    public final int getREQUEST_LIMIT() {
        return 0;
    }
    
    private final mako.application.itunesearcher.api.ItuneAPI.ItunesApiService getService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.Synchronized()
    public final synchronized io.reactivex.Observable<mako.application.itunesearcher.api.SearchResult> search(@org.jetbrains.annotations.NotNull()
    java.lang.String keyword, @org.jetbrains.annotations.NotNull()
    java.lang.String filter, int offset) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J6\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\tH\'\u00a8\u0006\u000b"}, d2 = {"Lmako/application/itunesearcher/api/ItuneAPI$ItunesApiService;", "", "searchSongs", "Lretrofit2/Call;", "Lmako/application/itunesearcher/api/SearchResult;", "term", "", "entity", "limit", "", "offset", "app_proRelease"})
    public static abstract interface ItunesApiService {
        
        @org.jetbrains.annotations.NotNull()
        @retrofit2.http.GET(value = "search")
        public abstract retrofit2.Call<mako.application.itunesearcher.api.SearchResult> searchSongs(@org.jetbrains.annotations.NotNull()
        @retrofit2.http.Query(value = "term")
        java.lang.String term, @org.jetbrains.annotations.NotNull()
        @retrofit2.http.Query(value = "entity")
        java.lang.String entity, @retrofit2.http.Query(value = "limit")
        int limit, @retrofit2.http.Query(value = "offset")
        int offset);
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 3)
        public static final class DefaultImpls {
        }
    }
}