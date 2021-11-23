package com.example.demospringbootproject.service;

import com.example.demospringbootproject.model.Student;
import com.example.demospringbootproject.repository.StudentJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DBService {

    @Autowired
    StudentJpaRepository repository;

    public String addStudent(Student student){
        repository.save(student);

        return "Successfully Saved to Database: "+ student.getName();
    }

    public List<Student> getStudents(){

        return repository.findAll();
    }

    public String updateStudent(Student student){
        repository.save(student);
        return "Successfully Updates name "+ student.getName();
    }

    public String deleteStudent(Long id){

        repository.deleteById(id);

        return "Successfully Deleted";
    }
}
