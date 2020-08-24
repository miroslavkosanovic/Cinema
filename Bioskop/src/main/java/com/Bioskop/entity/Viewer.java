package com.Bioskop.entity;

import javax.persistence.Column;
import java.util.ArrayList;

public class Viewer extends User{

    public ArrayList<Film> Watched = new ArrayList<Film>();

    public  ArrayList<Film> Reservated = new ArrayList<Film>();
    public ArrayList<Rating> Ratings = new ArrayList<Rating>();
}
