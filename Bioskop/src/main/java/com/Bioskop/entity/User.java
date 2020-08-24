package com.Bioskop.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class User implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    public Integer id;
    @Column
    public String username;
    @Column
    public String password;
    @Column
    public String name;
    @Column
    public long number;
    @Column
    public String mail;
    @Column
    public Date dateofbirth;
    @Enumerated(EnumType.STRING)
    @Column
    public Role role;

    @Column
    public boolean active;

    public User() {
    }

    public User(Integer id, String username, String password, String name, long number, String mail, Date dateofbirth, Role role, boolean active) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.number = number;
        this.mail = mail;
        this.dateofbirth = dateofbirth;
        this.role = role;
        this.active = active;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Date getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(Date dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", number=" + number +
                ", mail='" + mail + '\'' +
                ", dateofbirth=" + dateofbirth +
                ", role=" + role +
                ", active=" + active +
                '}';
    }
}
