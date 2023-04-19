package mako.application.itunesearcher.home

import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import mako.application.itunesearcher.api.SearchResult
import mako.application.itunesearcher.api.Song
import mako.application.itunesearcher.databinding.CellDetailsBinding

class DetailsHolder(val binding: CellDetailsBinding): RecyclerView.ViewHolder(binding.root) {
    fun bind(song: Song) {
        binding.apply {
            detailsName.text = song.trackName
            detailsArtistName.text = song.artistName
            Picasso.get().load(song.artworkUrl100).into(detailsPhoto)
        }
    }
}