package com.exampleDTO.demo4.controller;

import com.exampleDTO.demo4.DTO.CreateStudentRequestDTO;
import com.exampleDTO.demo4.entity.Student;
import com.exampleDTO.demo4.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService ss;
    @CrossOrigin
    @GetMapping("/get")
    public ResponseEntity<?> getAllStudents(){
        List<Student> student=ss.getAllStudents();
        if(student.isEmpty()){
            return new ResponseEntity<>("no students are there",HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(ss.getAllStudents(), HttpStatus.OK);
    }
    @CrossOrigin
//    @PostMapping("/create")
//    public ResponseEntity<?> uploadStudent(@RequestBody Student s){
//        return new ResponseEntity<>(ss.uploadStudent(s),HttpStatus.OK);
//
//    }
    @PostMapping("/create")
    public ResponseEntity<?> uploadStudent(@RequestBody CreateStudentRequestDTO csrd) {

        return new ResponseEntity<>(ss.uploadStudent(csrd), HttpStatus.OK);
    }
    @CrossOrigin
    @GetMapping("/getStudent/{id}")
    public ResponseEntity<?> getStudentById(@PathVariable int id){
        Student s=ss.getStudentbyid(id);
        if(s==null){
            return new ResponseEntity<>("data not found",HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(s,HttpStatus.OK);
    }
    @CrossOrigin
    @PutMapping("/updateStudent/{id}")
    public ResponseEntity<?> updateStudentId(@RequestBody Student student, @PathVariable int id){

        System.out.println("Controller reached");
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getDep());
        return new ResponseEntity<>(ss.updateStudentById(student,id),HttpStatus.OK);
    }
    @CrossOrigin
    @DeleteMapping("/deleteStudent/{id}")
    public ResponseEntity<?> deleteStudentById(@PathVariable int id){

        return new ResponseEntity<>(ss.deleteStudent(id),HttpStatus.OK);
    }
}
