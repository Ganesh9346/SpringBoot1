package com.Ganesh.demo.studentserver.service;

import com.Ganesh.demo.studentserver.entity.Student;
import com.Ganesh.demo.studentserver.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class StudentService {
    StudentRepository studentRepository;
    @Autowired
    public StudentService(StudentRepository studentRepository){
        this.studentRepository=studentRepository;
    }
    public Student studentValidate(Student student){

        int id= student.getId();
        String name=student.getName();
        int age= student.getAge();
        String department= student.getDepartment();


        if(id < 0|| name == null || age<0 || department == null){
            return null;
        }
//
        studentRepository.save(student);
        return student;


    }

    public Student getStudentById(int id){
        return studentRepository.findById(id).orElse(null);
    }
    public Student updateStudent(int id){
        return studentRepository.findById(id).orElse(null);
    }
    public Student deleteStudent(int id){
        return studentRepository.findById(id).orElse(null);
    }

}