package com.Ganesh2.demo3.controller;

import com.Ganesh2.demo3.entity.Student;
import com.Ganesh2.demo3.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpRequest;
import java.util.List;

@RestController
public class StudentController2 {
    @Autowired
    StudentService studentservice;
    @CrossOrigin
    @PostMapping("/create")
    public ResponseEntity<String> uploadStudent(@RequestBody Student student){

        studentservice.uploadData(student);
        return new ResponseEntity<>("uploaded",HttpStatus.CREATED);
    }
    @GetMapping("/getStudent")
    public ResponseEntity<List<Student>> getStudents(){

        return new ResponseEntity<>(studentservice.displayStudents(),HttpStatus.OK);
    }
    @CrossOrigin
    @DeleteMapping("/deleteStudent/{id}")
    public String Delete(@PathVariable int id){

        return studentservice.DeleteData(id);
    }
    @CrossOrigin
    @PutMapping("/updateStudent/{id}")
    public String update(@PathVariable int id,@RequestBody Student s){

        return studentservice.updateData(id,s);
    }
    @CrossOrigin
    @GetMapping("/getStudent/{id}")
    public Student getStudent(@PathVariable int id){

        return studentservice.getStudentById(id);
    }


}
