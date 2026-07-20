package com.exampleDTO.demo4.service;

import com.exampleDTO.demo4.DTO.CreateStudentRequestDTO;
import com.exampleDTO.demo4.entity.Student;
import com.exampleDTO.demo4.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository sr;
    public List<Student> getAllStudents(){
        List<Student> s=sr.findAll();
        return s;
    }

    public CreateStudentRequestDTO uploadStudent(CreateStudentRequestDTO csrd) {
        Student student=mapToStudent(csrd);

        sr.save(student);
       CreateStudentRequestDTO csr=mapToResponseDTO(student);
       return csr;

    }


    public Student getStudentbyid(int id) {
        return sr.findById(id).orElse(null);
    }

    public String updateStudentById(Student student, int id) {
        Student res=sr.findById(id).orElse(null);
        res.setDep(student.getDep());
        res.setName(student.getName());
        res.setEmail(student.getEmail());
        res.setDep(student.getDep());
        sr.save(res);
        return "updated successfully";

    }

    public String deleteStudent(int id){
        sr.deleteById(id);
        return "Deleted Successfully";
    }
    private Student mapToStudent(CreateStudentRequestDTO studentdto){
        Student s1=new Student();
        s1.setName(studentdto.getName());
        s1.setAge(studentdto.getAge());
        s1.setDep(studentdto.getDepartment());
        return s1;

    }
    private CreateStudentRequestDTO mapToResponseDTO(Student s1){
        CreateStudentRequestDTO csr=new CreateStudentRequestDTO();
        csr.setName(s1.getName());
        csr.setAge(s1.getAge());
        csr.setDepartment(s1.getDep());
        return csr;
    }
}
