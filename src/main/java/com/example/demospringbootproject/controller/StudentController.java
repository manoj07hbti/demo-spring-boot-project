package com.example.demospringbootproject.controller;


import com.example.demospringbootproject.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    List<Student> studentList=new ArrayList<>();

    @RequestMapping(value="/add_student", method= RequestMethod.POST)
    public String add(@RequestBody Student student){

        studentList.add(student);

        return "Object added Successfully";
    }

    @RequestMapping(value ="get_students", method = RequestMethod.GET)
    public List<Student> getStudentList(){

        return studentList;
    }


    @RequestMapping(value ="/update_student", method = RequestMethod.PUT)
    public String update(@RequestParam String name){

        studentList.get(0).setName(name);

        return "Record Updated";
    }

    @RequestMapping(value = "/delete_student", method = RequestMethod.DELETE)
    public String delete(){

        studentList.remove(0);
        return "Record Deleted";
    }

}
