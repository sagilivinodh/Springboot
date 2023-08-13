package com.luv2code.demo.rest;

import com.luv2code.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> theStudents;

    // define @PostConstruct to load the student data.......only once!
    @PostConstruct
    public void loadData() {
        theStudents = new ArrayList<>();
        theStudents.add(new Student("Vinodh", "Sagili"));
        theStudents.add(new Student("Ravi", "kumar"));
        theStudents.add(new Student("Pradeep", "ranga"));
        theStudents.add(new Student("sumukh", "pabbathi"));
    }

    // define endpoints "/students/{}" - return list of students
     @GetMapping("/students")
     public List<Student> getStudents() {
        return theStudents;
     }

     // define endpoints "/students/{studentID}"- return student at index
    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId) {
        // check the student id again list size
        if((studentId >= theStudents.size()) || (studentId < 0)) {
            throw new StudentNotFoundException("Student id not found - " + studentId);
        }
        return theStudents.get(studentId);
    }



}



















