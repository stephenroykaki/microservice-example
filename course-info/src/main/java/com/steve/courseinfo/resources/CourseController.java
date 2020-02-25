package com.steve.courseinfo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.steve.courseinfo.models.Course;

@RestController
public class CourseController {

	@Autowired
	private List<Course> list;
	
	@RequestMapping("/courses")
	public List<Course> getAll(){
		return list;
	}
	
	@RequestMapping("/courses/{id}")
	public Course getCourseById(@PathVariable("id") String id) {
		return list.stream().filter(s -> s.getId().equals(id)).findFirst().get();
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/courses")
	public void addCourse(@RequestBody Course course) {
		list.add(course);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/courses")
	public void editCourse(@RequestBody Course course) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getId().equals(course.getId())) {
				list.set(i, course);
				return;
			}
		}
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/courses/{id}")
	public void delCourse(@PathVariable("id") String id) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getId().equals(id)) {
				list.remove(i);
				return;
			}
		}
	}
}
