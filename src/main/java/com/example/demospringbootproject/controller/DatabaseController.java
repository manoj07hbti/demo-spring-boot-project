package com.example.demospringbootproject.controller;

import com.example.demospringbootproject.model.Student;
import com.example.demospringbootproject.service.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DatabaseController {

    @Autowired
    DBService service;

    @PostMapping("/add_std")
    public String addStudent(@RequestBody Student student){

    return service.addStudent(student);

    }

    @GetMapping("/get_std")
    public List<Student> getStudents(){

        return service.getStudents();
    }

    @PutMapping("/update_std")
    public String updateStudent(@RequestBody Student student){

        return service.updateStudent(student);
    }

    @DeleteMapping("/delete_std")
    public String deleteStd(@RequestParam Long id){

       return service.deleteStudent(id);


    }

}
