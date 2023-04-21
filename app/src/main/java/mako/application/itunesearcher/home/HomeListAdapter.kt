package mako.application.itunesearcher.home

import android.content.Context
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import mako.application.itunesearcher.R
import mako.application.itunesearcher.api.ItuneAPI
import mako.application.itunesearcher.api.SearchResult
import mako.application.itunesearcher.api.Song
import mako.application.itunesearcher.listener.OnFavouriteClickedListener
import mako.application.itunesearcher.units.Utils

class HomeListAdapter(val c: Context): RecyclerView.Adapter<RecyclerView.ViewHolder>(), OnFavouriteClickedListener {
    private val CELL_NORMAL = 0
    private val CELL_LOADING = 1

    private var items = ArrayList<Song>()
    private var footer: Song = Song(isFooterItem = true)
    private var filter: String = ""

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        when(viewType) {
            CELL_LOADING -> {
                return FooterHolder(DataBindingUtil.inflate(LayoutInflater.from(c), R.layout.cell_footer, parent, false))
            }
        }

        return DetailsHolder(DataBindingUtil.inflate(LayoutInflater.from(c), R.layout.cell_details, parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        // details holder
        if(holder is DetailsHolder) {
            holder.bind(position, getSong(position), filter, this@HomeListAdapter)
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun getItemViewType(position: Int): Int {
        return if(getSong(position).isFooterItem) CELL_LOADING else CELL_NORMAL
    }

    fun reset() {
        items.clear()
    }

    fun refresh(response: ArrayList<Song>, filter: String) {
        this.filter = filter

        if(items.contains(footer)) {
            items.remove(footer)
        }

        items.addAll(response)

        if(response.size == ItuneAPI.REQUEST_LIMIT) items.add(footer)
    }

    fun getSong(pos: Int): Song {
        return items[pos]
    }

    override fun onFavouriteClicked(position: Int) {

        var storage: ArrayList<Song> = Utils.getFavouriteList(c)
        var selectedSong = getSong(position)

        when(filter) {
            Utils.FILTER_TYPE_SONG -> {
                for(s in storage) {
                    // wrapperType == "track" && same trackId
                    if(TextUtils.equals(selectedSong.wrapperType, s.wrapperType) && selectedSong.trackId == s.trackId) {
                        updateFavouriteStorage(selectedSong, storage)
                        break
                    }
                }

            }
            Utils.FILTER_TYPE_ALBUM -> {

            }
            Utils.FILTER_TYPE_ARTIST -> {

            }
        }

    }

    private fun updateFavouriteStorage(s: Song, selectedSong: ArrayList<Song>) {
        // todo save updated fav data
    }
}