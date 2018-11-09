package com.example.videolibrary.movies.service;

import com.example.videolibrary.movies.domain.Movies;
import com.example.videolibrary.movies.repository.MoviesRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class MovieServiceImpl implements MovieService {

    @NonNull private final MoviesRepository moviesRepository;

    @Override
    public List<Movies> getAllMovies() {
        return (List<Movies>) moviesRepository.findAll();
    }

    @Override
    public Movies getMovieById(Long id) {
        return  moviesRepository.findById(id).get();
    }
}
