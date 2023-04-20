package mako.application.itunesearcher.home

import android.text.TextUtils
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import mako.application.itunesearcher.api.SearchResult
import mako.application.itunesearcher.api.Song
import mako.application.itunesearcher.databinding.CellDetailsBinding

class DetailsHolder(val binding: CellDetailsBinding): RecyclerView.ViewHolder(binding.root) {
    fun bind(song: Song, filter: String) {
        binding.apply {

            when(filter) {
                "song" -> {
                    detailsName.text = song.trackName
                    detailsArtistName.text = song.artistName
                }
                "album" -> {
                    detailsName.text = song.collectionName
                    detailsArtistName.text = song.artistName
                }
                "musicArtist" -> {
                    detailsName.text = song.artistName
                    detailsArtistName.text = song.primaryGenreNameP
                }
            }

            if(!TextUtils.isEmpty(song.artworkUrl100))
            Picasso.get().load(song.artworkUrl100).into(detailsPhoto)
        }
    }
}