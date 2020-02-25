package com.steve.resultsinfo.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.steve.resultsinfo.models.Result;
import com.steve.resultsinfo.models.Results;

@RestController
public class ResultController {
	
	@Autowired
	private List<Result> list;
	
	@RequestMapping("/results")
	public List<Result> getAll(){
		return list;
	}
	
	@RequestMapping("/results/{id}")
	public Results getResultById(@PathVariable("id") String sid) {
		ArrayList<Result> results = new ArrayList<>();
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getSid().equals(sid)) {
				results.add(list.get(i));
			}
		}
		return new Results(sid, results);
		//return list.stream().filter(s -> s.getSid().equals(sid))
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/results")
	public void addResult(@RequestBody Result result) {
		list.add(result);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/results")
	public void editResult(@RequestBody Result result) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getId().equals(result.getId())) {
				list.set(i, result);
				return;
			}
		}
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/results/{id}")
	public void delResult(@PathVariable("id") String id) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getId().equals(id)) {
				list.remove(i);
				return;
			}
		}
	}
}
