package com.movieservicedemo.movieinfoservice.model;

public class Movie {
    private String movieId;
    private String movieName;

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Movie(String movieId, String movieName) {
        this.movieId = movieId;
        this.movieName = movieName;
    }

    public String getMovieName() {
        return movieName;
    }
}
