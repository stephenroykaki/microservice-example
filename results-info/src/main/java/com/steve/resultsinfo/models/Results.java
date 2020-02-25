package com.steve.resultsinfo.models;

import java.util.List;

public class Results {
	private String sid;
	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	private List<Result> results;

	public List<Result> getResults() {
		return results;
	}

	public void setResults(List<Result> results) {
		this.results = results;
	}

	public Results(String sid, List<Result> results) {
		this.results = results;
		this.sid=sid;
	}

	public Results() {
	}
	
}
