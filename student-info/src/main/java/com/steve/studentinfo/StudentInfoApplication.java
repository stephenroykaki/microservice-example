package com.steve.studentinfo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.steve.studentinfo.models.Student;

@SpringBootApplication
public class StudentInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentInfoApplication.class, args);
	}
	
	@Bean
	public List<Student> getStudentList(){
		return new ArrayList<Student>(Arrays.asList(
				new Student("s1","stephen","iiit"),
				new Student("s2","rajesh","iiit"),
				new Student("s3","sunil","nit"),
				new Student("s4","sound","jntu")
		));
	}

}
