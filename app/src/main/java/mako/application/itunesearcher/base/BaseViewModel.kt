package mako.application.itunesearcher.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

open abstract class BaseViewModel<T> : ViewModel() {
    private val _mutableLiveData = MutableLiveData<T>()
    private val mLiveData: LiveData<T> = _mutableLiveData

    fun onDataChanged(values: T) {
        _mutableLiveData.value = values!!
    }

    fun getLiveData(): LiveData<T> {
        return mLiveData
    }
}