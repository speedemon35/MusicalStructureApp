package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the buy category
        TextView buy = findViewById(R.id.buy);

        // Set a click listener on that View
        buy.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the buy category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link BuyActivity}
                Intent buyIntent = new Intent(MainActivity.this, BuyActivity.class);

                // Start the new activity
                startActivity(buyIntent);
            }
        });

        // Find the View that shows the search category
        TextView search = findViewById(R.id.search);

        // Set a click listener on that View
        search.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the search category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SearchActivity}
                Intent searchIntent = new Intent(MainActivity.this, SearchActivity.class);

                // Start the new activity
                startActivity(searchIntent);
            }
        });

        // Find the View that shows the playlists category
        TextView playlists = findViewById(R.id.playlists);

        // Set a click listener on that View
        playlists.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the playlists category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PlaylistsActivity}
                Intent playlistsIntent = new Intent(MainActivity.this, PlaylistsActivity.class);

                // Start the new activity
                startActivity(playlistsIntent);
            }
        });

        // Find the View that shows the nowplaying category
        TextView playing = findViewById(R.id.playing);

        // Set a click listener on that View
        playing.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the playing category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PhrasesActivity}
                Intent playingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);

                // Start the new activity
                startActivity(playingIntent);
            }
        });
    }
}