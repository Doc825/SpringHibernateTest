package com.davidkhachatrian.springhibernate.repository;

import com.davidkhachatrian.springhibernate.entity.Lessons;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonsRepository extends JpaRepository<Lessons, Integer> {
}
