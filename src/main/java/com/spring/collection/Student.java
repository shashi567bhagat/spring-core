package com.spring.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {

	private String name;
	
	private List<String> address;
	
	private Set<String> phoneno;
	
	
	private Map<String, String> course;


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the address
	 */
	public List<String> getAddress() {
		return address;
	}


	/**
	 * @param address the address to set
	 */
	public void setAddress(List<String> address) {
		this.address = address;
	}


	/**
	 * @return the phoneno
	 */
	public Set<String> getPhoneno() {
		return phoneno;
	}


	/**
	 * @param phoneno the phoneno to set
	 */
	public void setPhoneno(Set<String> phoneno) {
		this.phoneno = phoneno;
	}


	/**
	 * @return the course
	 */
	public Map<String, String> getCourse() {
		return course;
	}


	/**
	 * @param course the course to set
	 */
	public void setCourse(Map<String, String> course) {
		this.course = course;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", phoneno=" + phoneno + ", course=" + course + "]";
	}

	
	
	
}
