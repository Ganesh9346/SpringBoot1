package com.Ganesh.demo.studentserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    StudentSevice ss;
    @Autowired
    public StudentController(StudentSevice ss){
        this.ss=ss;
    }
    @PostMapping("/create")

    public ResponseEntity<Student> storeStudent(@RequestBody Student s){


        Student result=ss.Studentvalidate(s);
        System.out.println(result);
        if(result==null){
            return ResponseEntity.status(400).body(result);
        }
        return ResponseEntity.status(201).body(result);
    }
}
