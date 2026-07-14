package com.example.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/student")

public class StudentController {
    @Autowired
    StudentService service;

    @PostMapping("/new")
    public String createStudent(@RequestBody model m) {

        return service.createStudent(m);
    }

    //fetch all users
    @GetMapping("/fetchall")
    public List<model> getAllStudents() {
        return service.getAllStudents();
    }

    //fetch by id
    @GetMapping("/fetch{id}")
    public model getUserById(@PathVariable int id) {

        return service.getUserById(id);
    }

    //delete by id
    @GetMapping("/delete(id)")
    public String deleteById(@PathVariable int id) {
        return service.deleteById(id);

    }
}
