package mako.application.itunesearcher.base

import com.google.gson.Gson
import io.reactivex.ObservableEmitter
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class BaseCallback<T : Any>(var cls: T, private val emitter: ObservableEmitter<T>) : Callback<T> {

    override fun onFailure(call: Call<T>, t: Throwable) {
        emitter.onError(t)
    }

    override fun onResponse(call: Call<T>, response: Response<T>) {
        response.body()?.apply {
            emitter.onNext(this)
        }

        response.errorBody()?.apply {
            try {
                var errorBody = JSONObject()
                errorBody.put("code", response.code())
                errorBody.put("message", response.message())

                cls = Gson().fromJson(errorBody.toString(), cls.javaClass)
            } catch (e: Exception) {
                e.printStackTrace()
            } finally {
                emitter.onNext(cls)
            }
        }
        emitter.onComplete()
    }
}