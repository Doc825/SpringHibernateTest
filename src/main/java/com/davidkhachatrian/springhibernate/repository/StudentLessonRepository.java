package com.davidkhachatrian.springhibernate.repository;

import com.davidkhachatrian.springhibernate.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentLessonRepository extends JpaRepository<Student, Integer>{
}
