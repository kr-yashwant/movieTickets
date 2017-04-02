package com.example.yash.repo;

import com.example.yash.domain.Movie;
import com.example.yash.domain.Show;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;

/**
 * Created by nfn8y on 01-04-2017.
 */
public interface ShowRepository extends CrudRepository<Show, Integer>{
    public Show findByMovieAndTime(Movie movie, Date time);

    public Show findByShowID(String showID);
}
