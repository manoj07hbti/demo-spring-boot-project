package com.example.demospringbootproject.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalController {

//PATHVARIABLE
@RequestMapping("/add/{a}/{b}")
    public int addition(@PathVariable int a, @PathVariable int b){

        int result=a+b;
        return result;
    }
    //add
    //sub
    //mul
    //divide

 // REQUEST PARAM

  @RequestMapping("sub")
  public int sub(@RequestParam int a, @RequestParam int b){
    int sub=a-b;
    return sub;

  }

}
