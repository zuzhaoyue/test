package com.example.demo.controller;

import com.example.demo.config.GlobalProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * Created by zuzhaoyue on 17/8/31.
 */
@RestController
public class TestController {

    @Value("${name}")
    private String name;

    @Value("${content}")
    private String content;

    @Autowired
    GlobalProperties globalProperties;

    @RequestMapping("/test")
    public String get(){
        return name;
    }

    @RequestMapping("/test1")
    public String getProperties(){
        return globalProperties.getName()+ globalProperties.getAge();
    }
//    @RequestMapping(value = {"/test/{id}","/t/"},method = RequestMethod.GET)
    @GetMapping("/test/{id}")
    public String test(@PathVariable("id") Integer aid){
        return "hello " + aid;
    }
}
