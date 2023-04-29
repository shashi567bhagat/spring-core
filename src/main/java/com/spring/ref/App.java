package com.spring.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/ref/config.xml");
		Student s=context.getBean("st",Student.class);
		
		System.out.println(s.getName());
		System.out.println(s.getAddress().getId());
		System.out.println(s.getAddress().getCity());
		
	}
	
	
}
