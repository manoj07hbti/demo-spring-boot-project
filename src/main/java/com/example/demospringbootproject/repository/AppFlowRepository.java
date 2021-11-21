package com.example.demospringbootproject.repository;

import org.springframework.stereotype.Repository;

@Repository
public class AppFlowRepository {

    public String message(){

        return "Hello from Repository Layer ";
    }
}
