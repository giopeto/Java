package com.example.videolibrary.movies.repository;

import com.example.videolibrary.movies.domain.Movies;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoviesRepository extends CrudRepository<Movies, Long> {
}
