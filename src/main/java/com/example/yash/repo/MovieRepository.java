package com.example.yash.repo;

import com.example.yash.domain.Movie;
import org.springframework.data.repository.CrudRepository;

import static javafx.scene.input.KeyCode.T;

/**
 * Created by nfn8y on 01-04-2017.
 */
public interface MovieRepository extends CrudRepository<Movie, Integer>{
    public Movie findByTitle(String title);
}
