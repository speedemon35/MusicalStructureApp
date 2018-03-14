package com.example.android.musicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class BuyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create a list of songs
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("Song name", "Artist name"));
        songs.add(new Song("Never gonna give you up", "Rick Astley"));
        songs.add(new Song("Giddy Up", "Network Musical Ensemble"));
        songs.add(new Song("Caramelldansen", "Caramell"));
        songs.add(new Song("All Star", "Smash Mouth"));
        songs.add(new Song("Brain Power", "NOMA"));
        songs.add(new Song("My Horse is Amazing", "Jonti Picking"));
        songs.add(new Song("Jump", "Van Halen"));

        // Create an {@link songAdapter}, whose data source is a list of {@link song}s. The
        // adapter knows how to create list items for each item in the list.
        SongAdapter adapter = new SongAdapter(this, songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // song_list.xml layout file.
        ListView listView = findViewById(R.id.list);

        // Make the {@link ListView} use the {@link songAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link song} in the list.
        listView.setAdapter(adapter);
    }
}