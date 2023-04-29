package com.spring.primitive;

public class Student {

	
	private int id;
	private String Name;
	private String address;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		
		System.out.println("setid"+ " "+id);
		this.id = id;
	}
	
	public String getName() {
		return Name;
	}
	
	
	public void setName(String name) {
		System.out.println("setName"+ " " + name);
		Name = name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		System.out.println("setAddress" + " " +address);
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", Name=" + Name + ", address=" + address + "]";
	}
	
	
	
	
	
	
}
