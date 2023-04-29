package com.spring.constructor.primitive;

public class Student {

	
	private int id;
	private String name;
	private String address;
	
	
	

	public Student(int id,String name,String address)
	{
		System.out.println("id" +"  "+ "name" +" " +"address");
		this.id=id;
		this.name=name;
		this.address=address;	
	}
	
	public Student(String name,int id,String address)
	{System.out.println("name" + "  " + "id" +"  " +"address");
		this.id=id;
		this.name=name;
		this.address=address;	
	}

	
	public Student(String name,String address,int id)
	{
		System.out.println("name" +" " +"address"+ "  " +" int");
		this.id=id;
		this.name=name;
		this.address=address;	
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
	
}
