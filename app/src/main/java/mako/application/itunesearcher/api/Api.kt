package mako.application.itunesearcher.api

import mako.application.itunesearcher.constant.ENV
import retrofit2.Retrofit

object Api {
    val baseURL = ENV.URL

    val itune = Retrofit.Builder().apply {
        baseUrl(baseURL).build()
    }
}