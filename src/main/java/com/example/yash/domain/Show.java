package com.example.yash.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by nfn8y on 01-04-2017.
 */
@Entity
public class Show {
    @Id
    @GeneratedValue
    private Integer showID;

    @ManyToOne
    private Movie movie;

    @Column
    private Date time;

    @Column
    private Integer strength;

    @Column
    private Integer countSold;

    protected Show() {

    }
    public Show(Movie movie, Date time, int strength, int countSold) {
        this.movie = movie;
        this.time = time;
        this.strength = strength;
        this.countSold = countSold;
    }

    public Integer getShowID() {
        return showID;
    }

    public void setShowID(Integer showID) {
        this.showID = showID;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = new Date(time.getTime());
    }

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public Integer getCountSold() {
        return countSold;
    }

    public void setCountSold(Integer countSold) {
        this.countSold = countSold;
    }
}
