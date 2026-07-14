package com.Ganesh.demo.studentserver;

import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {
    public Student save(Student s){
//        System.out.println("Student Information saved");
        return s;
    }
}
