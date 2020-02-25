package com.steve.displayservice.models;

public class Result {
	private String id;
	private String sid;
	private String cid;
	private int marks;
	public Result(String id, String sid, String cid, int marks) {
		this.id = id;
		this.sid = sid;
		this.cid = cid;
		this.marks = marks;
	}
	public Result() {
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
}
