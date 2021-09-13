package com.example.JenkinsDemo2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String demo(){
        return "Hello World";
    }

    @GetMapping("/Demo")
    public String Demo(){
        return "This is updated Code in /Demo path";
    }

    @GetMapping("/Demo1")
    public String Demo1(){
        return "This is updated Code in /Demo1 path";
    }
}
