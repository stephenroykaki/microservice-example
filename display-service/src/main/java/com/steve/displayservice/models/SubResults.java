package com.steve.displayservice.models;

public class SubResults {
	private String sname;
	private int marks;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public SubResults(String sname, int marks) {
		this.sname = sname;
		this.marks = marks;
	}
	public SubResults() {
	}
}
