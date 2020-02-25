package com.steve.displayservice.models;

public class Student {
	private String id;
	private String name;
	private String college;
	
	public Student() {
	}

	public Student(String id, String name, String college) {
		super();
		this.id = id;
		this.name = name;
		this.college = college;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}
	
	
}
