package mako.application.itunesearcher.api

data class SearchResult(
    val resultCount: Int = 0,
    val results: ArrayList<Song> = ArrayList()
)

data class Song(
    val wrapperType: String = "",    // "artist" , "collection", "track"
    val collectionName: String = "",
    val collectionType: String = "", // response value should be "Album"
    val collectionId: Long = 0, // album id
    val artistName: String = "",
    val artistType: String = "", // response value should be "Artist"
    val artistId: Long = 0,
    val artistLinkUrl: String = "",
    val primaryGenreName: String = "",
    val kind: String = "", // response value should be "song"
    val trackId: Long = 0,
    val trackName: String = "",
    val artworkUrl100: String = "",
    val primaryGenreNameP:  String = "",
    var isFavourited: Boolean = false,
    var isFooterItem: Boolean = false
)
