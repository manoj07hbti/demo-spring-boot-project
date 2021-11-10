package com.example.demospringbootproject.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // write a method or function which will print hello world on console
// END POINT1

    @RequestMapping("/message")
    public void hello(){

        System.out.println("Hello World ");
    }

    // write a method or function which will return Welcome to Spring Boot
// END POINT1

    @RequestMapping("/welcome")
    public String welcome(){

       return "Welcome to Spring Boot";
    }
}
