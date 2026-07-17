package com.Ganesh.demo.studentserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentSevice {

    StudentRepository sr;

    public StudentSevice(StudentRepository sr){
        this.sr=sr;
    }
    public Student Studentvalidate(Student s){
        int id= s.getId();
        String name=s.getName();
        int age=s.getAge();
        String department=s.getDepartment();
        if(id<0 || name==null || age<0 || department==null){
            return null;
        }
        sr.save(s);
        return s;

    }
}
