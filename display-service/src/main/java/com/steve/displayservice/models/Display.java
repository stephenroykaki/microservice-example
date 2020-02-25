package com.steve.displayservice.models;

import java.util.List;

public class Display {
	private String sname;
	private List<SubResults> subResults;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public List<SubResults> getSubResults() {
		return subResults;
	}
	public void setSubResults(List<SubResults> subResults) {
		this.subResults = subResults;
	}
	public Display(String sname, List<SubResults> subResults) {
		this.sname = sname;
		this.subResults = subResults;
	}
	public Display() {
	}
	
}
