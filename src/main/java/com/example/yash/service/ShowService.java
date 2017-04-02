package com.example.yash.service;

import com.example.yash.domain.Movie;
import com.example.yash.domain.Show;
import com.example.yash.repo.MovieRepository;
import com.example.yash.repo.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by nfn8y on 01-04-2017.
 */
@Service
public class ShowService {
    private MovieRepository movieRepository;
    private ShowRepository showRepository;

    @Autowired
    public ShowService(MovieRepository movieRepository, ShowRepository showRepository) {
        this.movieRepository = movieRepository;
        this.showRepository = showRepository;
    }

    public Show createShow(String movieTitle, Date time, int strength) {
        Movie movie = movieRepository.findByTitle(movieTitle);
        if (movie == null) {
            throw new RuntimeException("Movie " + movieTitle + " does not exist in our database. Care to check again?");
        }
        Show show = showRepository.findByMovieAndTime(movie, time);
        if (show != null) {
            throw new RuntimeException("But we already have a show for " + movie + " at " +
                    new SimpleDateFormat("dd/M/yyyy").format(time) + ". Another slot may be?");
        }
        return showRepository.save(new Show(movie, time, strength, 0));
    }
}
