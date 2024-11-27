package com.cjc.mian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cjc.mian.model.Student;

@SpringBootApplication
public class LombokAnnotationsByUsingConstApplication {

	public static void main(String[] args) {
		SpringApplication.run(LombokAnnotationsByUsingConstApplication.class, args);
	
		Student s = new Student(1, "Pooja", "Nashik");
		Student s1= new Student(2, "Vishal", "Pune");
		
		System.out.println(s);
		System.out.println(s1);
	}

}
