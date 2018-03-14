package com.example.android.musicalstructureapp;

/**
 * Created by danielmendes on 13/03/18.
 */

/**
 * {@link Song} represents data about the song being played.
 * It contains a song name and artist name/s.
 */
public class Song {

    /** Song name */
    private String mSongName;

    /** Artist name */
    private String mArtistName;

    /**
     * Create a new Song object.
     *
     * @param SongName is the name of the song
     * @param ArtistName is the name of the artist/s
     */
    public Song(String SongName, String ArtistName) {
        mSongName = SongName;
        mArtistName = ArtistName;
    }

    /**
     * Get the songs name.
     */
    public String getSongName() {
        return mSongName;
    }

    /**
     * Get the artists name.
     */
    public String getArtistName() {
        return mArtistName;
    }

}