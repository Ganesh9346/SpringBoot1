package com.database1.data1.service;

import com.database1.data1.Student;
import com.database1.data1.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepo sr;
    public List<Student> getallstudent(){
        return sr.findAll();
    }
    public String setdata(Student s){
        sr.save(s);
        return "data saved";
    }
}
