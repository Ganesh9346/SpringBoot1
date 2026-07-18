package com.Ganesh2.demo3.controller;

import com.Ganesh2.demo3.entity.Student;
import com.Ganesh2.demo3.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController2 {
    @Autowired
    StudentService studentservice;
    @CrossOrigin
    @PostMapping("/create")
    public String uploadStudent(@RequestBody Student student){
        studentservice.uploadData(student);
        return "uploaded";
    }
    @GetMapping("/getStudent")
    public List<Student> getStudents(){
        return studentservice.displayStudents();
    }
    @DeleteMapping("/delete/{id}")
    public String Delete(@PathVariable int id){
        return studentservice.DeleteData(id);
    }
    @PutMapping("/update")
    public String update(@RequestBody Student s){
        return studentservice.updateData(s);
    }
    @CrossOrigin
    @GetMapping("/getStudent/{id}")
    public Student getStudent(@PathVariable int id){
        return studentservice.getStudentById(id);
    }


}
