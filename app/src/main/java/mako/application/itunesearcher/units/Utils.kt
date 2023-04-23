package mako.application.itunesearcher.units

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.text.TextUtils
import android.util.Log
import com.google.gson.Gson
import com.google.gson.JsonSyntaxException
import com.google.gson.reflect.TypeToken
import mako.application.itunesearcher.DetailsPageActivity
import mako.application.itunesearcher.api.Song

object Utils {
    private val KEY_FAVOURITE = "key_favourites"
    val KEY_DETAIL_TITLE = "detail_title"
    val KEY_DETAIL_DESC = "detail_desc"
    val KEY_DETAIL_IMAGE = "detail_image"

    private lateinit var sp: SharedPreferences
    private lateinit var editor: SharedPreferences.Editor

    var FILTER_TYPE_SONG: String = "song"
    var FILTER_TYPE_ALBUM: String = "album"
    var FILTER_TYPE_ARTIST: String = "musicArtist"

    var WRAPPER_TYPE_ARTIST = "artist"
    var WRAPPER_TYPE_COLLECTION = "collection"
    var WRAPPER_TYPE_TRACK = "track"

    var ACTION_FAV_REFRESH = "actionFavRefresh"

    fun putString(c: Context, key: String, value: String) {
        sp = c.getSharedPreferences(c.applicationInfo.name, Context.MODE_PRIVATE)
        editor = sp.edit()

        if (TextUtils.isEmpty(value)) return
        editor.putString(key, value)
        editor.commit()
    }

    fun getString(c: Context, key: String): String {
        sp = c.getSharedPreferences(c.applicationInfo.name, Context.MODE_PRIVATE)
        return sp.getString(key, "") ?: ""
    }

    fun toggleDetailsPageActivity(c: Context, title: String, desc: String, image: String) {
        var intent = Intent(c, DetailsPageActivity::class.java)
        intent.putExtra(KEY_DETAIL_TITLE, title)
        intent.putExtra(KEY_DETAIL_DESC, desc)
        intent.putExtra(KEY_DETAIL_IMAGE, image)
        c.startActivity(intent)
    }

    @Synchronized
    fun saveFavouriteList(c: Context, songs: ArrayList<Song>) {
        var preStorage = Gson().toJson(songs)
        Log.d("machael", "save: "+preStorage)
        putString(c, KEY_FAVOURITE, preStorage)
    }

    @Synchronized
    fun getFavouriteList(c: Context): ArrayList<Song>{
        var songs = ArrayList<Song>()
        var storage = getString(c,KEY_FAVOURITE)

        if(!TextUtils.isEmpty(storage)) {
            val token = object : TypeToken<ArrayList<Song>>() {}
            try {
                songs = Gson().fromJson(storage, token.type)
            } catch (e: JsonSyntaxException) { }
        }
        Log.d("machael", "get store: "+storage)
        return songs
    }
}