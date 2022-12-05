package com.davidkhachatrian.springhibernate.controller;

import com.davidkhachatrian.springhibernate.repository.LessonsRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("lessons")
public class LessonsController {
    private final LessonsRepository lessonsRepository;

    public LessonsController(LessonsRepository lessonsRepository) {
        this.lessonsRepository = lessonsRepository;
    }

    public ResponseEntity getAllCourses(){
        return ResponseEntity.ok(this.lessonsRepository.findAll());
    }
}
