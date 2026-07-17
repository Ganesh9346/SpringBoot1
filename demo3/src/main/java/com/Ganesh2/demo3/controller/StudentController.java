package com.Ganesh2.demo3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @GetMapping("/hello")
    public String display(){
        return "hello Ganesh";
    }
}
