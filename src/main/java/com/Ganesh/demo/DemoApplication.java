package com.Ganesh.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
		Student s=new Student(21,"Ram");
		System.out.println(s.getAge());
		System.out.println(s.getName());
	}

}
