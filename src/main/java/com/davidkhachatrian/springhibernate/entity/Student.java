package com.davidkhachatrian.springhibernate.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "surname")
    private String surname;

    @Column(name = "name")
    private String name;

    @Column(name = "group_number")
    private int groupNum;

    @Column(name = "activity")
    private boolean activity;

    public Student() {
    }

    public Student(String surname, String name, int groupNum, boolean activity) {
        this.surname = surname;
        this.name = name;
        this.groupNum = groupNum;
        this.activity = activity;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroupNum() {
        return groupNum;
    }

    public void setGroupNum(int groupNum) {
        this.groupNum = groupNum;
    }

    public boolean isActivity() {
        return activity;
    }

    public void setActivity(boolean activity) {
        this.activity = activity;
    }
}
