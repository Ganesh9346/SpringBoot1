package com.Ganesh.demo.studentserver;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
    //public Student save(Student s){
//        System.out.println("Student Information saved");
        //return s;

}
