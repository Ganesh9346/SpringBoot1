package com.Ganesh.demo.studentserver;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    long id;
    String name;
    int age;

}
