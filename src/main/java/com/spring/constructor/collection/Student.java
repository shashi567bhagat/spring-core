package com.spring.constructor.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {

	
	private int id;
	private String name;
	private List<String> city;
	private Set<String> phoneno;
	private Map<String, String> certificate;
	public Student(int id, String name, List<String> city, Set<String> phoneno, Map<String, String> certificate) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.phoneno = phoneno;
		this.certificate=certificate;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", phoneno=" + phoneno + ", certificate="
				+ certificate + "]";
	}
	
	
	
	
	
	
	
	
	
}
