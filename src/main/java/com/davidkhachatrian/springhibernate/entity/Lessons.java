package com.davidkhachatrian.springhibernate.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "lessons")
public class Lessons {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "date_and_time")
    private Date dateAndTime;

    @Column(name = "max_grade")
    private int maxGrade;

    public Lessons() {
    }

    public Lessons(String name, Date dateAndTime, int maxGrade) {
        this.name = name;
        this.dateAndTime = dateAndTime;
        this.maxGrade = maxGrade;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(Date dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public int getMaxGrade() {
        return maxGrade;
    }

    public void setMaxGrade(int maxGrade) {
        this.maxGrade = maxGrade;
    }
}
