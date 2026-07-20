package com.exampleDTO.demo4.service;

import com.exampleDTO.demo4.DTO.CreateStudentRequestDTO;
import com.exampleDTO.demo4.DTO.CreateStudentUpdateRequestDTO;
import com.exampleDTO.demo4.DTO.CreateStudentUpdateResponceDTO;
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

    public CreateStudentUpdateResponceDTO updateStudentById(CreateStudentUpdateRequestDTO updateRequestDTO, int id) {
        Student res=sr.findById(id).orElse(null);
        res.setAge(updateRequestDTO.getAge());
        res.setName(updateRequestDTO.getName());
        res.setDep(updateRequestDTO.getDepartment());

        sr.save(res);
        CreateStudentUpdateResponceDTO responcedto=updateToResponceDTO(res);
        return responcedto;

    }

    public String deleteStudent(int id){
        sr.deleteById(id);
        return "Deleted Successfully";
    }
    private Student updateToStudentDTO(CreateStudentUpdateRequestDTO updateDto){
        Student s1=new Student();
        s1.setDep(updateDto.getDepartment());
        s1.setName(updateDto.getName());
        s1.setAge(updateDto.getAge());
        return s1;
    }
    private Student mapToStudent(CreateStudentRequestDTO studentdto){
        Student s1=new Student();
        s1.setName(studentdto.getName());
        s1.setAge(studentdto.getAge());
        s1.setDep(studentdto.getDepartment());
        return s1;

    }
    private CreateStudentUpdateResponceDTO updateToResponceDTO(Student s1){
        CreateStudentUpdateResponceDTO responceDTO=new CreateStudentUpdateResponceDTO();
        responceDTO.setAge(s1.getAge());
        responceDTO.setDepartment(s1.getDep());
        responceDTO.setName(s1.getName());
        return responceDTO;
    }
    private CreateStudentRequestDTO mapToResponseDTO(Student s1){
        CreateStudentRequestDTO csr=new CreateStudentRequestDTO();
        csr.setName(s1.getName());
        csr.setAge(s1.getAge());
        csr.setDepartment(s1.getDep());
        return csr;
    }
}
