package com.Ganesh.demo.studentserver.controller;
//package com.Ganesh.demo.studentserver.controller;
//
//import com.Ganesh.demo.studentserver.entity.Student;
//import com.Ganesh.demo.studentserver.service.StudentSevice;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class StudentController {
//
//    StudentSevice ss;
//    @Autowired
//    public StudentController(StudentSevice ss){
//        this.ss=ss;
//    }
//    @PostMapping("/create")
//
//    public ResponseEntity<?> storeStudent(@RequestBody Student s){
//
//
//        Student result=ss.Studentvalidate(s);
//        System.out.println(result);
//        if(result==null){
//            return ResponseEntity.status(400).body(result);
//        }
//        return ResponseEntity.status(201).body(result);
//    }
//}
















import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService =studentService;
    }
    @PostMapping("/create")
    public ResponseEntity<Student> storeStudent(@RequestBody Student student){
//        int id=student.getId();
//        String name=student.getName();
//        int age=student.getAge();
//        String department=student.getDepartment();
//        return "id : "+id+", name : "+name+", age : "+age+", department : "+department;
        Student result=studentService.studentValidate(student);

//          if(result==null){
//              return ResponseEntity.status(400).body(result);
//          }
        return ResponseEntity.status(201).body(student);


    }
    @GetMapping("/get/{id}")
    public ResponseEntity<?> getStudentById(@PathVariable int id){
        Student student =studentService.getStudentById(id);
        return ResponseEntity.status(200).body(student);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateStudent(@PathVariable int id, @RequestBody Student student) {
        Student updatedStudent = studentService.updateStudent(id);
        return ResponseEntity.status(200).body(updatedStudent);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteStudent(@PathVariable int id) {
        studentService.deleteStudent(id);
        return ResponseEntity.status(200).body("Student deleted successfully");
    }


}
