package com.example.demospringbootproject.controller;


import com.example.demospringbootproject.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    List<Student> studentList=new ArrayList<>();

    @RequestMapping("/add_student")
    public String add(){
        Student student=new Student("Raj",21,"CS");

        studentList.add(student);

        return "Object added Successfully";
    }

    @RequestMapping("get_students")
    public List<Student> getStudentList(){

        return studentList;
    }


    @RequestMapping("/update_student")
    public String update(){

        studentList.get(0).setName("Java");

        return "Record Updated";
    }

    @RequestMapping("/delete_student")
    public String delete(){

        studentList.remove(0);
        return "Record Deleted";
    }

}
