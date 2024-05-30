package com.testrest.testrest.controller;

import com.testrest.testrest.model.Student;
import com.testrest.testrest.repository.StudentJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/users")
public class StudentController {

    @Autowired
    private StudentJPARepository studentJPARepository;

    @GetMapping(value = "/all")
    public List<Student> findAllUsers() {
       return studentJPARepository.findAll();
    }

    @GetMapping(value = "/{name}")
    public Student findAllByName(@PathVariable final String name) {
        return studentJPARepository.findByName(name);
    }

    @PostMapping(value = "/load")
    public Student load(@RequestBody final Student user) {
        studentJPARepository.save(user);
        return studentJPARepository.findByName(user.getName());
    }

}
