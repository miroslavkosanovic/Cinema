package com.Bioskop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Film {
    @Column
    public String Name;

    @Column
    public String Description;

    @Column
    public String Genre;

    @Column
    public Integer DurationInMin;

    @Column
    public  long AverageRating;

}
