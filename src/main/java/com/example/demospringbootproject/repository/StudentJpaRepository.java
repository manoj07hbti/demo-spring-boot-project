package com.example.demospringbootproject.repository;

import com.example.demospringbootproject.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentJpaRepository extends JpaRepository <Student,Long>{

}
