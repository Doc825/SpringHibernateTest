package com.davidkhachatrian.springhibernate.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "ending_date")
    private Date endingDate;

    @Column(name = "activity")
    private boolean activity;

//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "lessons_id")
//    private List<Lessons> lessons;

    public Course() {
    }

    public Course(String name, Date startDate, Date endingDate, boolean activity) {
        this.name = name;
        this.startDate = startDate;
        this.endingDate = endingDate;
        this.activity = activity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndingDate() {
        return endingDate;
    }

    public void setEndingDate(Date endingDate) {
        this.endingDate = endingDate;
    }

    public boolean isActivity() {
        return activity;
    }

    public void setActivity(boolean activity) {
        this.activity = activity;
    }
}
