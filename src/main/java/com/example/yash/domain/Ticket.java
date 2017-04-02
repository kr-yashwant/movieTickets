package com.example.yash.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by nfn8y on 01-04-2017.
 */
@Entity
public class Ticket implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    private Show show;

    @Column
    private double price;

    @Column
    private String viewerName;

    protected Ticket() {

    }
    public Ticket(Show show, String viewerName, double price) {
        this.show = show;
        this.viewerName = viewerName;
        this.price = price;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public String getViewerName() {
        return viewerName;
    }

    public void setViewerName(String viewerName) {
        this.viewerName = viewerName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
