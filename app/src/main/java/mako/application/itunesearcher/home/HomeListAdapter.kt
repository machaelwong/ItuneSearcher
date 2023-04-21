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
            holder.bind(position, getSong(position), this@HomeListAdapter)
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun getItemViewType(position: Int): Int {
        return if(getSong(position).isFooterItem) CELL_LOADING else CELL_NORMAL
    }

    override fun onFavouriteClicked(position: Int)
    {
        var storage: ArrayList<Song> = Utils.getFavouriteList(c)
        var selectedSong = getSong(position)

        if(!storage.isNullOrEmpty())
        {
            var songFromStorage: Song = Song()
            var hasUpdate = false

            for(s in storage) {
                if(TextUtils.equals(selectedSong.wrapperType, s.wrapperType)) {
                    when(selectedSong.wrapperType)
                    {
                        Utils.WRAPPER_TYPE_TRACK -> {
                            if (selectedSong.trackId == s.trackId) {
                                songFromStorage = s
                                hasUpdate = true
                                break
                            }
                        }
                        Utils.WRAPPER_TYPE_COLLECTION -> {
                            if (selectedSong.collectionId == s.collectionId) {
                                songFromStorage = s
                                hasUpdate = true
                                break
                            }
                        }
                        Utils.WRAPPER_TYPE_ARTIST -> {
                            if (selectedSong.artistId == s.artistId) {
                                songFromStorage = s
                                hasUpdate = true
                                break
                            }
                        }
                    }
                }
            }

            if(hasUpdate) {
                updateFavouriteStorage(selectedSong, songFromStorage)
                if(!songFromStorage.isFavourited) {
                    storage.remove(songFromStorage)
                }
                Utils.saveFavouriteList(c, storage)
                notifyItemChanged(position)
                return
            }
        }

        // is a new favourite record
        selectedSong.isFavourited = true
        storage.add(selectedSong)
        Utils.saveFavouriteList(c, storage)
        notifyItemChanged(position)
    }

    private fun updateFavouriteStorage(selectedSong: Song, songFromStorage: Song) {
        selectedSong.isFavourited = !selectedSong.isFavourited
        songFromStorage.isFavourited = selectedSong.isFavourited
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
        setFavourite()
        if(response.size == ItuneAPI.REQUEST_LIMIT) items.add(footer)

        notifyDataSetChanged()
    }

    private fun setFavourite() {
        var storage: ArrayList<Song> = Utils.getFavouriteList(c)

        if(!storage.isNullOrEmpty()) {
            for(s in storage) {
                for(i in items) {
                    if(TextUtils.equals(s.wrapperType, i.wrapperType)) {
                        when(s.wrapperType)
                        {
                            Utils.WRAPPER_TYPE_TRACK -> {
                                if (s.trackId == i.trackId) {
                                    i.isFavourited = true
                                    break
                                }
                            }
                            Utils.WRAPPER_TYPE_COLLECTION -> {
                                if (s.collectionId == i.collectionId) {
                                    i.isFavourited = true
                                    break
                                }
                            }
                            Utils.WRAPPER_TYPE_ARTIST -> {
                                if (s.artistId == i.artistId) {
                                    i.isFavourited = true
                                    break
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private fun getSong(pos: Int): Song {
        return items[pos]
    }
}