package com.eduhub.eduhub_backend.controller;

import com.eduhub.eduhub_backend.Component.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    @GetMapping("/student")
    public ResponseEntity<Student> getStudent() {
        Student student = new Student(1,"John");
        return ResponseEntity.ok(student);
    }
    @GetMapping("/students")
    public ResponseEntity<List<Student>> getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"John"));
        students.add(new Student(2,"Doe"));
        return ResponseEntity.ok(students);
    }
    @GetMapping("/student/{id}/{name}")
    public ResponseEntity<Student> getStudent(@PathVariable int id, @PathVariable String name) {
        Student student = new Student(id,name);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }
    @GetMapping("/query")
    public ResponseEntity<Student> queryStudents(@RequestParam int id,@RequestParam String name) {
        Student student = new Student(id,name);
        return ResponseEntity.ok(student);
    }
}
