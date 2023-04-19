package mako.application.itunesearcher.api

import io.reactivex.Observable
import mako.application.itunesearcher.base.BaseCallback
import mako.application.itunesearcher.constant.ENV
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

object ItuneAPI {

    private val service: ItunesApiService get() = Retrofit.Builder()
        .baseUrl(ENV.URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build().create(ItunesApiService::class.java)

    @Synchronized
    fun search(keyword: String, filter: String): Observable<SearchResult> {
        return Observable.create { emitter ->
            service.searchSongs(
                term = keyword,
                entity = filter).enqueue(BaseCallback<SearchResult>(SearchResult(), emitter))
        }
    }

    interface ItunesApiService {
        @GET("search")
        fun searchSongs(
            @Query("term") term: String,
            @Query("entity") entity: String,
            @Query("limit") limit: Int = 20,
            @Query("offset") offset: Int = 20
        ): Call<SearchResult>
    }
}