package mako.application.itunesearcher.api

data class SearchResult(
    val resultCount: Int = 0,
    val results: ArrayList<Song> = ArrayList()
)

data class Song(
    val trackId: Long = 0,
    val trackName: String = "",
    val artistName: String = "",
    val collectionName: String = "",
    val artworkUrl100: String = "",
    val primaryGenreNameP:  String = "",
    val wrapperType: String = "",
    var isFooterItem: Boolean = false
)
