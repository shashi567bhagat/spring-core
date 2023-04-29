package com.spring.primitive;

import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ApplicationContext contxt = new ClassPathXmlApplicationContext("com/spring/primitive/config.xml");

		Student st1 = contxt.getBean("st1", Student.class);
		Student st2 = contxt.getBean("st2", Student.class);

		System.out.println(st1);
		System.out.println(st2);
	}
}
