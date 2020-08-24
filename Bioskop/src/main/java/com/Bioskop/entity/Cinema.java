package com.Bioskop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.ArrayList;

@Entity
public class Cinema {
    @Column
    public String Name;
    @Column
    public String Adress;
    @Column
    public String Phone;
    @Column
    public  String Mail;
    @Column
    public User Menager;
    //dodaj raspored
}
