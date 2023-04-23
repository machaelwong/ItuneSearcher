package mako.application.itunesearcher.favourite

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import mako.application.itunesearcher.R
import mako.application.itunesearcher.api.Song
import mako.application.itunesearcher.home.DetailsHolder
import mako.application.itunesearcher.home.HomeViewModel
import mako.application.itunesearcher.listener.OnFavouriteClickedListener
import mako.application.itunesearcher.units.Utils

class FavouriteAdapter(val c: Context, val model: HomeViewModel): RecyclerView.Adapter<DetailsHolder>(), OnFavouriteClickedListener {
    lateinit var songs: ArrayList<Song>
    var dialog: AlertDialog? = null
    var builder: AlertDialog.Builder = AlertDialog.Builder(c)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetailsHolder {
        return DetailsHolder(DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.cell_details, parent, false))
    }

    override fun onBindViewHolder(holder: DetailsHolder, position: Int) {
        holder.bind(c, position, songs[position], this@FavouriteAdapter)
    }

    override fun getItemCount(): Int = songs.size

    override fun onFavouriteClicked(position: Int) {
        if(dialog != null && dialog?.isShowing == true) return

        builder.setMessage(R.string.msg_favourite_delete)

        builder.setPositiveButton(R.string.label_remove) { dialog, which ->
            // update favourite listing
            songs.remove(songs[position])
            notifyDataSetChanged()

            // save
            Utils.saveFavouriteList(c, songs)
            c.sendBroadcast(Intent(Utils.ACTION_FAV_REFRESH))
            dialog.dismiss()
        }
        builder.setNegativeButton(R.string.label_cancel) { dialog, which ->
            dialog.dismiss()
        }

        dialog = builder.show()
    }

    fun refresh(storage: ArrayList<Song>) {
        songs = storage
        notifyDataSetChanged()
    }
}