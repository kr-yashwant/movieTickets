package com.example.yash.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by nfn8y on 01-04-2017.
 */
@Entity
public class Movie implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String title;
    @Column
    private String director;
    @Column
    private String producer;
    @Column
    private double budget;
    protected Movie() {

    }

    public Movie(String title, String director, String producer, double budget) {
        this.director = director;
        this.title = title;
        this.producer = producer;
        this.budget = budget;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
