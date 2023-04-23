package mako.application.itunesearcher.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b*\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u00a5\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0002\u0010\u0015J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\t\u0010,\u001a\u00020\u0007H\u00c6\u0003J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\t\u0010.\u001a\u00020\u0003H\u00c6\u0003J\t\u0010/\u001a\u00020\u0003H\u00c6\u0003J\t\u00100\u001a\u00020\u0013H\u00c6\u0003J\t\u00101\u001a\u00020\u0013H\u00c6\u0003J\t\u00102\u001a\u00020\u0003H\u00c6\u0003J\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\t\u00104\u001a\u00020\u0007H\u00c6\u0003J\t\u00105\u001a\u00020\u0003H\u00c6\u0003J\t\u00106\u001a\u00020\u0003H\u00c6\u0003J\t\u00107\u001a\u00020\u0007H\u00c6\u0003J\t\u00108\u001a\u00020\u0003H\u00c6\u0003J\t\u00109\u001a\u00020\u0003H\u00c6\u0003J\u00a9\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u00c6\u0001J\u0013\u0010;\u001a\u00020\u00132\b\u0010<\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010=\u001a\u00020>H\u00d6\u0001J\t\u0010?\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\n\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\u0014\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010 \"\u0004\b#\u0010\"R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u0011\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u0017R\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0019\u00a8\u0006@"}, d2 = {"Lmako/application/itunesearcher/api/Song;", "", "wrapperType", "", "collectionName", "collectionType", "collectionId", "", "artistName", "artistType", "artistId", "artistLinkUrl", "primaryGenreName", "kind", "trackId", "trackName", "artworkUrl100", "primaryGenreNameP", "isFavourited", "", "isFooterItem", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "getArtistId", "()J", "getArtistLinkUrl", "()Ljava/lang/String;", "getArtistName", "getArtistType", "getArtworkUrl100", "getCollectionId", "getCollectionName", "getCollectionType", "()Z", "setFavourited", "(Z)V", "setFooterItem", "getKind", "getPrimaryGenreName", "getPrimaryGenreNameP", "getTrackId", "getTrackName", "getWrapperType", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "app_proRelease"})
public final class Song {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String wrapperType = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String collectionName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String collectionType = null;
    private final long collectionId = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String artistName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String artistType = null;
    private final long artistId = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String artistLinkUrl = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String primaryGenreName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String kind = null;
    private final long trackId = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String trackName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String artworkUrl100 = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String primaryGenreNameP = null;
    private boolean isFavourited;
    private boolean isFooterItem;
    
    @org.jetbrains.annotations.NotNull()
    public final mako.application.itunesearcher.api.Song copy(@org.jetbrains.annotations.NotNull()
    java.lang.String wrapperType, @org.jetbrains.annotations.NotNull()
    java.lang.String collectionName, @org.jetbrains.annotations.NotNull()
    java.lang.String collectionType, long collectionId, @org.jetbrains.annotations.NotNull()
    java.lang.String artistName, @org.jetbrains.annotations.NotNull()
    java.lang.String artistType, long artistId, @org.jetbrains.annotations.NotNull()
    java.lang.String artistLinkUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String primaryGenreName, @org.jetbrains.annotations.NotNull()
    java.lang.String kind, long trackId, @org.jetbrains.annotations.NotNull()
    java.lang.String trackName, @org.jetbrains.annotations.NotNull()
    java.lang.String artworkUrl100, @org.jetbrains.annotations.NotNull()
    java.lang.String primaryGenreNameP, boolean isFavourited, boolean isFooterItem) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Song() {
        super();
    }
    
    public Song(@org.jetbrains.annotations.NotNull()
    java.lang.String wrapperType, @org.jetbrains.annotations.NotNull()
    java.lang.String collectionName, @org.jetbrains.annotations.NotNull()
    java.lang.String collectionType, long collectionId, @org.jetbrains.annotations.NotNull()
    java.lang.String artistName, @org.jetbrains.annotations.NotNull()
    java.lang.String artistType, long artistId, @org.jetbrains.annotations.NotNull()
    java.lang.String artistLinkUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String primaryGenreName, @org.jetbrains.annotations.NotNull()
    java.lang.String kind, long trackId, @org.jetbrains.annotations.NotNull()
    java.lang.String trackName, @org.jetbrains.annotations.NotNull()
    java.lang.String artworkUrl100, @org.jetbrains.annotations.NotNull()
    java.lang.String primaryGenreNameP, boolean isFavourited, boolean isFooterItem) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWrapperType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCollectionName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCollectionType() {
        return null;
    }
    
    public final long component4() {
        return 0L;
    }
    
    public final long getCollectionId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getArtistName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getArtistType() {
        return null;
    }
    
    public final long component7() {
        return 0L;
    }
    
    public final long getArtistId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getArtistLinkUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPrimaryGenreName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKind() {
        return null;
    }
    
    public final long component11() {
        return 0L;
    }
    
    public final long getTrackId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTrackName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getArtworkUrl100() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPrimaryGenreNameP() {
        return null;
    }
    
    public final boolean component15() {
        return false;
    }
    
    public final boolean isFavourited() {
        return false;
    }
    
    public final void setFavourited(boolean p0) {
    }
    
    public final boolean component16() {
        return false;
    }
    
    public final boolean isFooterItem() {
        return false;
    }
    
    public final void setFooterItem(boolean p0) {
    }
}