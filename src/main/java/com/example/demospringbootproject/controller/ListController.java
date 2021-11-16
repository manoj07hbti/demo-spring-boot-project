package com.example.demospringbootproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ListController {

    List<String> stringList= new ArrayList<>();

    // CRUD - C - Create/insert/add , R- read , U-Update , D - delete
//C - Create/insert/add  add?value="Java"
    @RequestMapping("/add")
    public String addToList(@RequestParam String value){

        stringList.add(value);

        return "Object is successfully added to the list";
    }

    //Read or get

    @RequestMapping("/get")
    public  List<String> getStringList(){

        return stringList;
    }

    //Update

    @RequestMapping("/update")
    public String updateList(){


        stringList.add(0,"Spring");
        return "Object is  updated successfully";
    }

    //delete / remove
    @RequestMapping("/remove")
    public String deleteObject(){
        stringList.remove(0);
        return "Object is  deleted successfully";
    }
}
