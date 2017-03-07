package com.example.thannathrnyuwasin.newit;

/**
 * Created by thannathrnyuwasin on 3/6/2017 AD.
 */

public class Detail {
    private String title, genre, year;

    public Detail() {
    }

    public Detail(String title, String genre, String year) {
        this.title = title;
        this.genre = genre;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
