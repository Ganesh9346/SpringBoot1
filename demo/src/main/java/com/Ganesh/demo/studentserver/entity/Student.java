package com.Ganesh.demo.studentserver.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    int id;
    String name;
    int age;
    String department;



    int marks;

public Student(){

}
//    public Student(int id, String name, int age, String department) {
//        this.id = id;
//        this.name = name;
//        this.age = age;
//        this.department = department;
//    }


    public Student(int id, String name, int age, String department, int marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }






    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
