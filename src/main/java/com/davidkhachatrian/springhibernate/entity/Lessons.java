package com.davidkhachatrian.springhibernate.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "lessons")
public class Lessons {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "date_and_time")
    private Date dateAndTime;

    @Column(name = "max_grade")
    private double maxGrade;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "lessons")
    private Course course;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lessons")
    private List<Student> studentList;


    @ManyToMany
    @JoinTable(name = "student_lesson",
            joinColumns = @JoinColumn(name = "lesson_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id"))
    private List<Student> students;

    public Lessons() {
    }

    public Lessons(String name, Date dateAndTime, int maxGrade) {
        this.name = name;
        this.dateAndTime = dateAndTime;
        this.maxGrade = maxGrade;
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

    public Date getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(Date dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public double getMaxGrade() {
        return maxGrade;
    }

    public void setMaxGrade(int maxGrade) {
        this.maxGrade = maxGrade;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "Lessons{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateAndTime=" + dateAndTime +
                ", maxGrade=" + maxGrade +
                '}';
    }
}
