package mako.application.itunesearcher.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007J\u0013\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\fR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lmako/application/itunesearcher/base/BaseViewModel;", "T", "Landroidx/lifecycle/ViewModel;", "()V", "_mutableLiveData", "Landroidx/lifecycle/MutableLiveData;", "mLiveData", "Landroidx/lifecycle/LiveData;", "getLiveData", "onDataChanged", "", "values", "(Ljava/lang/Object;)V", "app_proRelease"})
public abstract class BaseViewModel<T extends java.lang.Object> extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<T> _mutableLiveData = null;
    private final androidx.lifecycle.LiveData<T> mLiveData = null;
    
    public BaseViewModel() {
        super();
    }
    
    public final void onDataChanged(T values) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<T> getLiveData() {
        return null;
    }
}