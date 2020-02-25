package com.steve.courseinfo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.steve.courseinfo.models.Course;

@SpringBootApplication
public class CourseInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseInfoApplication.class, args);
	}
	
	@Bean
	public List<Course> getList(){
		return new ArrayList<Course>(Arrays.asList(
			new Course("c1","Java"),
			new Course("c2","Spring"),
			new Course("c3","Hibernate")
		));
	}

}
