package com.spring.constructor.ref;

import java.util.List;

public class Student {

	private int id;
	private String name;
	private List<String> city;
	private Certificate certificate;
	public Student(int id, String name, List<String> city, Certificate certificate) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.certificate = certificate;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", certificate=" + certificate + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
