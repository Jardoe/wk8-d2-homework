package com.example.user.songlist;

import android.media.Image;

import java.io.Serializable;

/**
 * Created by user on 20/03/2018.
 */

public class Song implements Serializable {
    private String title;
    private String artist;
    private int ranking;
    private Image image;

    public Song(String title, String artist, Integer ranking, Image image){
        this.title = title;
        this.artist = artist;
        this.ranking = ranking;
        this.image = image;
    }


    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public Integer getRanking() {
        return ranking;
    }

    public Image getImage(){
        return image;
    }
}
