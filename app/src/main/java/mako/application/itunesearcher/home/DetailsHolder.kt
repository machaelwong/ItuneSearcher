package mako.application.itunesearcher.home

import android.text.TextUtils
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import mako.application.itunesearcher.R
import mako.application.itunesearcher.api.Song
import mako.application.itunesearcher.databinding.CellDetailsBinding
import mako.application.itunesearcher.listener.OnFavouriteClickedListener
import mako.application.itunesearcher.units.Utils

class DetailsHolder(val binding: CellDetailsBinding): RecyclerView.ViewHolder(binding.root) {
    fun bind(position: Int, song: Song, listener:  OnFavouriteClickedListener) {
        binding.apply {

            detailsFav.isSelected = song.isFavourited
            detailsFav.setOnClickListener { v ->
                listener.onFavouriteClicked(position)
            }

            when(song.wrapperType) {
                Utils.WRAPPER_TYPE_TRACK -> {
                    detailsName.text = song.trackName
                    detailsArtistName.text = song.artistName
                }
                Utils.WRAPPER_TYPE_COLLECTION -> {
                    detailsName.text = song.collectionName
                    detailsArtistName.text = song.artistName
                }
                Utils.WRAPPER_TYPE_ARTIST -> {
                    detailsName.text = song.artistName
                    detailsArtistName.text = song.primaryGenreNameP
                }
            }

            if(!TextUtils.isEmpty(song.artworkUrl100)) {
                Picasso.get().load(song.artworkUrl100).into(detailsPhoto)
            } else {
                if(song.wrapperType == Utils.WRAPPER_TYPE_ARTIST) {
                    detailsPhoto.setImageResource(R.drawable.ic_details_artist)
                } else {
                    detailsPhoto.setImageDrawable(null)
                }
            }
        }
    }
}