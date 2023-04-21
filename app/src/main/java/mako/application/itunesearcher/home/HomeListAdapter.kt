package mako.application.itunesearcher.home

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import mako.application.itunesearcher.R
import mako.application.itunesearcher.api.ItuneAPI
import mako.application.itunesearcher.api.Song

class HomeListAdapter(val c: Context): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
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
            holder.bind(getSong(position), filter)
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
}