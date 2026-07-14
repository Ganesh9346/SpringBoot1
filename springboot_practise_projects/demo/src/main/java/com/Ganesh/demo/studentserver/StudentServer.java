package com.Ganesh.demo.studentserver;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentServer {
    //store the student
    @PostMapping("/create")
    public String storeStudent(){
        return """
                id:1,
                name:Ram,
                Department:CSE,
                age:25
                """;
    }

    //read the student


    //update the student


    //delete the student
}
