package com.Ganesh2.demo3.service;

import com.Ganesh2.demo3.entity.Student;
import com.Ganesh2.demo3.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository sr;
    public void uploadData(Student student){
        sr.save(student);
    }
    public List<Student> displayStudents(){
        return sr.findAll();
    }
    public String DeleteData(int id){
        sr.deleteById(id);
        return "data deleated";
    }
    public String updateData(Student s){
        sr.save(s);
        return "data saved successfully";
    }
    public Student getStudentById(int id){
        return sr.findById(id).orElse(null);
    }
}
