package mako.application.itunesearcher.home

import io.reactivex.disposables.Disposable
import mako.application.itunesearcher.api.ItuneAPI
import mako.application.itunesearcher.api.SearchResult
import mako.application.itunesearcher.base.BaseViewModel

class HomeViewModel: BaseViewModel<SearchResult>() {
    fun search(key: String) {
        ItuneAPI.search(key, "songs").subscribe(object: io.reactivex.Observer<SearchResult> {
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
                    onDataChanged(this)
                }
            }
        })
    }
}