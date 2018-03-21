package com.example.user.songlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TopSongs topSongs = new TopSongs();
        ArrayList<Song> list = topSongs.getList();

        TopSongsAdapter songsAdapter = new TopSongsAdapter(this, list);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(songsAdapter);


    }
}
