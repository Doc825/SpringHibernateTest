package com.davidkhachatrian.springhibernate.repository;

import com.davidkhachatrian.springhibernate.entity.Lessons;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LessonsRepository extends JpaRepository<Lessons, Integer> {
}
