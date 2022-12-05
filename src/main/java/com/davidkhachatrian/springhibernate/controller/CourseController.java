package com.davidkhachatrian.springhibernate.controller;

import com.davidkhachatrian.springhibernate.repository.CourseRpository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
public class CourseController {

    private final CourseRpository courseRpository;

    public CourseController(CourseRpository courseRpository) {
        this.courseRpository = courseRpository;
    }

    public ResponseEntity getAllCourses(){
        return ResponseEntity.ok(this.courseRpository.findAll());
    }
}
