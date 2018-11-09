package com.example.videolibrary.movies.service;


import com.example.videolibrary.movies.domain.Movies;

import java.util.List;

public interface MovieService {

    public List<Movies> getAllMovies();
    public Movies getMovieById(Long id);
}
