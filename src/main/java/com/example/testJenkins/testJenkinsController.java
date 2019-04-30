package com.example.testJenkins;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class testJenkinsController {

    @GetMapping("/start")
    public String start(){
        return "Hello World!!";
    }
}
