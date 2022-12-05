package com.davidkhachatrian.springhibernate.controller;

import com.davidkhachatrian.springhibernate.repository.StudentLessonRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student_lesson")
public class StudentLessonController {

    private final StudentLessonRepository studentLessonRepository;

    public StudentLessonController(StudentLessonRepository studentLessonRepository) {
        this.studentLessonRepository = studentLessonRepository;
    }

    public ResponseEntity getAllStudentsByLesson(){
        return ResponseEntity.ok(this.studentLessonRepository.findAll());
    }
}
