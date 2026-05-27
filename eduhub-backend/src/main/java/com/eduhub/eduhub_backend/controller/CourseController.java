package com.eduhub.eduhub_backend.controller;

import com.eduhub.eduhub_backend.Component.Course;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {
    static List<Course> courses=new ArrayList<Course>();
    static {
        courses.add(new Course("os", "u23cs101", 3));
        courses.add(new Course("oe", "u23oe101", 3));
        courses.add(new Course("fs", "u23cs103", 4));
        courses.add(new Course("ps", "u23ma104", 4));
        courses.add(new Course("cc", "u23cs105", 3));
        courses.add(new Course("cn", "u23ec106", 4));
    }
    @GetMapping
    public ResponseEntity<List<Course>>getAllCourses(){
        return ResponseEntity.ok(courses);
    }
    @GetMapping("/{code}")
    public ResponseEntity<Course> getCourse(@PathVariable String code){
        for(Course c:courses){
            if(c.getCode().equals(code)){
                return ResponseEntity.ok(c);
            }
        }
        return ResponseEntity.notFound().build();
    }
    @GetMapping("/search")
    public ResponseEntity<List<Course>> getCourseByCourseCode(@RequestParam String code){
        for(Course c:courses){
            if(c.getCode().equals(code)){
                return ResponseEntity.ok(courses);
            }
        }
        return ResponseEntity.notFound().build();
    }
    @PostMapping
    public ResponseEntity<Course> addCourse(@RequestBody Course course){
        courses.add(course);
        return ResponseEntity.ok(course);
    }
    @PutMapping("/{code}")
    public ResponseEntity<Course> updateCourse(@RequestBody Course course){
        for(Course c:courses){
            if(c.getCode().equals(course.getCode())){
                c.setCredit(course.getCredit());
                c.setName(course.getName());
                return ResponseEntity.ok(c);

            }
        }
        return ResponseEntity.notFound().build();
    }
    @DeleteMapping("/{code}")
    public ResponseEntity<Course> deleteCourse(@PathVariable String code){
        for(Course c:courses){
            if(c.getCode().equals(code)){
                courses.remove(c);
                return ResponseEntity.ok(c);
            }
        }
        return ResponseEntity.notFound().build();
    }

}
