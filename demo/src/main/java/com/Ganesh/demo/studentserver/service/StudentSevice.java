package com.Ganesh.demo.studentserver.service;

import com.Ganesh.demo.studentserver.entity.Student;
import com.Ganesh.demo.studentserver.repository.StudentRepository;
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
    public String SaveData(Student s){
        sr.save(s);
        return "Saved data";
    }
}
