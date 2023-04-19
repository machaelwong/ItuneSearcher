package mako.application.itunesearcher.api

data class SearchResult(
    val resultCount: Int = 0,
    val results: List<Song> = ArrayList()
)

data class Song(
    val trackId: Long,
    val trackName: String,
    val artistName: String,
    val collectionName: String,
    val artworkUrl100: String
)
