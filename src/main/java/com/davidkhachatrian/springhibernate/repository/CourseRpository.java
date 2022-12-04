package com.davidkhachatrian.springhibernate.repository;

import com.davidkhachatrian.springhibernate.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRpository extends JpaRepository<Course, Integer> {
}
