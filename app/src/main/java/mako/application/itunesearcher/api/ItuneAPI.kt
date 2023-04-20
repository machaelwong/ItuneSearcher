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
    val REQUEST_LIMIT = 20

    private val service: ItunesApiService get() = Retrofit.Builder()
        .baseUrl(ENV.URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build().create(ItunesApiService::class.java)

    @Synchronized
    fun search(keyword: String, filter: String, offset: Int): Observable<SearchResult> {
        return Observable.create { emitter ->
            service.searchSongs(
                term = keyword,
                entity = filter,
                offset = offset).enqueue(BaseCallback<SearchResult>(SearchResult(), emitter))
        }
    }

    interface ItunesApiService {
        @GET("search")
        fun searchSongs(
            @Query("term") term: String,
            @Query("entity") entity: String,
            @Query("limit") limit: Int = REQUEST_LIMIT,
            @Query("offset") offset: Int
        ): Call<SearchResult>
    }
}