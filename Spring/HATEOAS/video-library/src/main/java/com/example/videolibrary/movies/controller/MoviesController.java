package com.example.videolibrary.movies.controller;

import com.example.videolibrary.movies.domain.Movies;
import com.example.videolibrary.movies.service.MovieService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@RestController
@RequestMapping("movies")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class MoviesController {

    @NonNull
    private final MovieService movieService;

    @GetMapping
    public List<Resource<Movies>> getAllMovies() {
        return getMovieResources(movieService.getAllMovies());
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
    public Resource<Movies> getMovieById(@PathVariable Long id) {
        return getMovieResource(movieService.getMovieById(id));
    }

    private List<Resource<Movies>> getMovieResources(List<Movies> allMovies) {
        List<Resource<Movies>> resources = new ArrayList<>();
        allMovies.forEach(movie -> resources.add(getMovieResource(movie)));

        return resources;
    }

    private Resource<Movies> getMovieResource(Movies movie) {
        Resource<Movies> resource = new Resource<>(movie);
        resource.add(linkTo(methodOn(MoviesController.class).getMovieById(movie.getId())).withSelfRel());


        return resource;
    }

}
