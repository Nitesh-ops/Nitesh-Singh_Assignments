package com.Question6_Assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Question6 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring_Question6.xml");
		Database database = context.getBean("database", Database.class);
		System.out.println(database);
	}

}
