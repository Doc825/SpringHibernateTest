package com.davidkhachatrian.springhibernate.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "student_lesson")
public class StudentLesson {

    @Id
    @Column(name = "id", nullable = false)
    private int id;

    @ManyToMany
    @JoinColumn(name = "lessons_id")
    private List<Lessons> lessons;

    @ManyToMany
    @JoinColumn(name = "student_id")
    private List<Student> studentList;


}
