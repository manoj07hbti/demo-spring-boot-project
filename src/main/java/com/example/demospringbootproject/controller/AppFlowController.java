package com.example.demospringbootproject.controller;

import com.example.demospringbootproject.service.AppFlowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppFlowController {

    @Autowired
    AppFlowService service;

    @RequestMapping("/app_flow_message")
    public String hello(){

     //   AppFlowService service=new AppFlowService();
        String msg=  service.message();
        return msg;
    }
}
