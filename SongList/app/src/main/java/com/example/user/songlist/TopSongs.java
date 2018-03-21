package com.example.user.songlist;

import android.media.Image;

import java.util.ArrayList;

/**
 * Created by user on 20/03/2018.
 */

public class TopSongs {

    private ArrayList<Song> list;

    public TopSongs(){
        list = new ArrayList<>();
        list.add(new Song("Angst", "Valentin Stip", 1, ));
        list.add(new Song("Clare de Lune", "Flight Facilities",2));
        list.add(new Song("Miss you", "Trentemoller",3));
        list.add(new Song("Moan", "Trentemoller",4));
        list.add(new Song("Carbonated", "Mount Kimbie",5));
        list.add(new Song("Beautiful Life", "Gui Boratto",6));
        list.add(new Song("Movements", "Blue Sky Black Death",7));
    }

    public ArrayList<Song> getList(){
        return new ArrayList<>(list);
    }
}
