package mako.application.itunesearcher.home

import android.text.TextUtils
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import mako.application.itunesearcher.api.SearchResult
import mako.application.itunesearcher.api.Song
import mako.application.itunesearcher.databinding.CellDetailsBinding
import mako.application.itunesearcher.listener.OnFavouriteClickedListener
import mako.application.itunesearcher.units.Utils

class DetailsHolder(val binding: CellDetailsBinding): RecyclerView.ViewHolder(binding.root) {
    fun bind(position: Int, song: Song, filter: String, listener:  OnFavouriteClickedListener) {
        binding.apply {

            detailsFav.setOnClickListener { v ->
                listener.onFavouriteClicked(position)
            }

            when(filter) {
                Utils.FILTER_TYPE_SONG -> {
                    detailsName.text = song.trackName
                    detailsArtistName.text = song.artistName
                }
                Utils.FILTER_TYPE_ALBUM -> {
                    detailsName.text = song.collectionName
                    detailsArtistName.text = song.artistName
                }
                Utils.FILTER_TYPE_ARTIST -> {
                    detailsName.text = song.artistName
                    detailsArtistName.text = song.primaryGenreNameP
                }
            }

            if(!TextUtils.isEmpty(song.artworkUrl100))
            Picasso.get().load(song.artworkUrl100).into(detailsPhoto)
        }
    }
}