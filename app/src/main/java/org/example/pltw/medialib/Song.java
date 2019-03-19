package org.example.pltw.medialib;

public class Song {
    private int rating;
    private String title;

    /**
     * Constructor for objects of class Song
     */
    public Song() {
        // initialise instance variables
        rating = 0;
        title = "";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String t) {
        title = t;
    }


    public int getRating() {
        return rating;
    }

    public void setRating(int r) {
        rating = r;
    }
}
