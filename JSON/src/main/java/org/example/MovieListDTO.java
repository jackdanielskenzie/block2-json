package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class MovieListDTO {

    @JsonProperty("movies")
    private List<Movies> movies;

    public List<Movies> getMovies() {
        return movies;
    }

    public void setMovies(List<Movies> movies) {
        this.movies = movies;
    }
}
