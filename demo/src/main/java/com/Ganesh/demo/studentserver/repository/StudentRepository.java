//package com.Ganesh.demo.studentserver.repository;
//
//import com.Ganesh.demo.studentserver.entity.Student;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface StudentRepository extends JpaRepository<Student,Integer> {
//
//
//}





package com.Ganesh.demo.studentserver.repository;

import com.Ganesh.demo.studentserver.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student,Integer> {



//    public Student save(Student student){
//        System.out.println("Student information saved");
//        return student;
//    }


}
