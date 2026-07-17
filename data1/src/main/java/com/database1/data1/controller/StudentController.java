package com.database1.data1.controller;

import com.database1.data1.Student;
import com.database1.data1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService ss;
    @GetMapping("/get")
    public List<Student> getallStudent(){
        return ss.getallstudent();
    }
    @PostMapping("/student")
    public String setdata(@RequestBody Student s){
        ss.setdata(s);
        return "data saved";
    }
}
