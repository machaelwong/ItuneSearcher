package mako.application.itunesearcher.home

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import mako.application.itunesearcher.R
import mako.application.itunesearcher.api.Song

class HomeListAdapter(val c: Context): RecyclerView.Adapter<DetailsHolder>() {
    private var songs: List<Song> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetailsHolder {
        return DetailsHolder(DataBindingUtil.inflate(LayoutInflater.from(c), R.layout.cell_details, parent, false))
    }

    override fun onBindViewHolder(holder: DetailsHolder, position: Int) {
        holder.bind(getSong(position))
    }

    override fun getItemCount(): Int {
        return songs.size
    }

    fun refresh(songs: List<Song>) {
        this.songs = songs
    }

    fun getSong(pos: Int): Song {
        return songs[pos]
    }
}