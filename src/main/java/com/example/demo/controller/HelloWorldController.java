package com.example.demo.controller;

import com.example.demo.entity.BlogProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @Autowired
    private BlogProperties blogProperties;

    @RequestMapping("/")
    public String sayHello(){
        return "Hello World!";
    }

    @RequestMapping("/getName")
    public String getName(){
        return blogProperties.getName();
    }

    @RequestMapping("/getTitle")
    public String getTitle(){
        return blogProperties.getTitle();
    }

    @RequestMapping("/getDesc")
    public String getDesc(){
        return blogProperties.getDesc();
    }

    @RequestMapping("/getTestValue")
    public String getTestValue(){
        return blogProperties.getRandomInt();
    }

}
