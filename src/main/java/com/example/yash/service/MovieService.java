package com.example.yash.service;

import com.example.yash.domain.Movie;
import com.example.yash.repo.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by nfn8y on 01-04-2017.
 */
@Service
public class MovieService {
    private MovieRepository movieRepository;

    @Autowired
    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Movie createMovie(String title, String director, String producer, double budget) {
        Movie movie = movieRepository.findByTitle(title);
        if(movie != null) {
            return null;
        }
        movie = movieRepository.save(new Movie(title, director, producer, budget));
        return movie;
    }
}
