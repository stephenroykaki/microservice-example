package com.steve.studentinfo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.steve.studentinfo.models.Student;

@RestController
public class StudentController {
	
	@Autowired
	private List<Student> list;
	
	@RequestMapping("/students")
	public List<Student> getAll(){
		return list;
	}
	
	@RequestMapping("/students/{id}")
	public Student getStudentById(@PathVariable("id") String id) {
		return list.stream().filter(s -> s.getId().equals(id)).findFirst().get();
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/students")
	public void addStudent(@RequestBody Student student) {
		list.add(student);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/students")
	public void editStudent(@RequestBody Student student) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getId().equals(student.getId())) {
				list.set(i, student);
				return;
			}
		}
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/students/{id}")
	public void delStudent(@PathVariable("id") String id) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getId().equals(id)) {
				list.remove(i);
				return;
			}
		}
	}
	
}
