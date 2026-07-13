package com.Ganesh.demo;

import com.Ganesh.demo.dependencyInjection.OrderService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		ApplicationContext container= SpringApplication.run(DemoApplication.class, args);
//		Student s1=container.getBean(Student.class);
//		s1.setName("Ramu");
//		s1.setAge(22);
//		System.out.println(s1.getName());
//		System.out.println(s1.getAge());
		OrderService os=container.getBean(OrderService.class);
		os.placeOrder();
	}

}
