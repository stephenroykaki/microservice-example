package com.steve.displayservice.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.steve.displayservice.models.Course;
import com.steve.displayservice.models.Display;
import com.steve.displayservice.models.Results;
import com.steve.displayservice.models.Student;
import com.steve.displayservice.models.SubResults;

@RestController
public class DisplayContoller {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/results/{sid}")
	public Display getResultById(@PathVariable String sid){
		Student student = restTemplate.getForObject("http://STUDENT-SERVICE/students/"+sid, Student.class);
		Results results = restTemplate.getForObject("http://RESULT-SERVICE/results/"+sid, Results.class);
		List<SubResults> subResults = new ArrayList<>();
		for(int i=0; i<results.getResults().size(); i++) {
			Course course = restTemplate.getForObject("http://COURSE-SERVICE/courses/"+results.getResults().get(i).getCid(), Course.class);
			subResults.add(new SubResults(course.getName(),results.getResults().get(i).getMarks()));
		}
		return new Display(student.getName(),subResults);
	}

}
