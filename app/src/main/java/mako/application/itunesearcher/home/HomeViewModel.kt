package mako.application.itunesearcher.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import io.reactivex.disposables.Disposable
import mako.application.itunesearcher.api.ItuneAPI
import mako.application.itunesearcher.api.SearchResult
import mako.application.itunesearcher.base.BaseViewModel

class HomeViewModel: BaseViewModel<SearchResult>() {
    private val _isFavouriteRemoved = MutableLiveData<Boolean>()
    private val isFavouriteRemoved: LiveData<Boolean> = _isFavouriteRemoved
    private var offset = 0;

    @Synchronized
    fun search(key: String, filter: String, resetOffset: Boolean) {

        if(resetOffset) offset = 0

        ItuneAPI.search(key, filter, offset).subscribe(object: io.reactivex.Observer<SearchResult> {
            lateinit var response: SearchResult

            override fun onSubscribe(d: Disposable) {}

            override fun onNext(response: SearchResult) {
                this.response = response
            }

            override fun onError(e: Throwable) {
                onDataChanged(SearchResult())
            }

            override fun onComplete() {
                this.response?.apply {
                    offset += ItuneAPI.REQUEST_LIMIT
                    onDataChanged(this)
                }
            }
        })
    }

    fun onFavouriteRemoved(values: Boolean) {
        _isFavouriteRemoved.value = values
    }

    fun isFavouriteRemoved(): LiveData<Boolean> {
        return isFavouriteRemoved
    }
}