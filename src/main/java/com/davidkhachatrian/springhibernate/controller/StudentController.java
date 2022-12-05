package com.davidkhachatrian.springhibernate.controller;

import com.davidkhachatrian.springhibernate.repository.StudentRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public ResponseEntity getAllStudents(){
        return ResponseEntity.ok(this.studentRepository.findAll());
    }
}
