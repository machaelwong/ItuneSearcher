package mako.application.itunesearcher.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u001b\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u00a2\u0006\u0002\u0010\u0007J\u001e\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J$\u0010\u0013\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016R\u001c\u0010\u0004\u001a\u00028\u0000X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lmako/application/itunesearcher/base/BaseCallback;", "T", "", "Lretrofit2/Callback;", "cls", "emitter", "Lio/reactivex/ObservableEmitter;", "(Ljava/lang/Object;Lio/reactivex/ObservableEmitter;)V", "getCls", "()Ljava/lang/Object;", "setCls", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "onFailure", "", "call", "Lretrofit2/Call;", "t", "", "onResponse", "response", "Lretrofit2/Response;", "app_proRelease"})
public final class BaseCallback<T extends java.lang.Object> implements retrofit2.Callback<T> {
    @org.jetbrains.annotations.NotNull()
    private T cls;
    private final io.reactivex.ObservableEmitter<T> emitter = null;
    
    public BaseCallback(@org.jetbrains.annotations.NotNull()
    T cls, @org.jetbrains.annotations.NotNull()
    io.reactivex.ObservableEmitter<T> emitter) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final T getCls() {
        return null;
    }
    
    public final void setCls(@org.jetbrains.annotations.NotNull()
    T p0) {
    }
    
    @java.lang.Override()
    public void onFailure(@org.jetbrains.annotations.NotNull()
    retrofit2.Call<T> call, @org.jetbrains.annotations.NotNull()
    java.lang.Throwable t) {
    }
    
    @java.lang.Override()
    public void onResponse(@org.jetbrains.annotations.NotNull()
    retrofit2.Call<T> call, @org.jetbrains.annotations.NotNull()
    retrofit2.Response<T> response) {
    }
}