package mako.application.itunesearcher.home

import io.reactivex.disposables.Disposable
import mako.application.itunesearcher.api.ItuneAPI
import mako.application.itunesearcher.api.SearchResult
import mako.application.itunesearcher.base.BaseViewModel

class HomeViewModel: BaseViewModel<SearchResult>() {
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
                onDataChanged(null)
            }

            override fun onComplete() {
                this.response?.apply {
                    offset += ItuneAPI.REQUEST_LIMIT
                    onDataChanged(this)
                }
            }
        })
    }
}