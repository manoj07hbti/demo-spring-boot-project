package com.example.demospringbootproject.service;

import com.example.demospringbootproject.repository.AppFlowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppFlowService {

    @Autowired
    AppFlowRepository repository;

    public String message(){

       // return "Hello from Service Layer ";

        //AppFlowRepository repository= new AppFlowRepository();
       return repository.message();
    }
}
