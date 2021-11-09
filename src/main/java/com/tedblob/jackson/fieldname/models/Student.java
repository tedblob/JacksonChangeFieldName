package com.tedblob.jackson.fieldname.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Student {
	
	public Student(long id, String name) {
		this.id = id;
		this.studentName = name;
	}
	
	public Student() {
	}

	private long id;
	@JsonProperty("name")
	private String studentName;
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", studentName=" + studentName + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	
}
