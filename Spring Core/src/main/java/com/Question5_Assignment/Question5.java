package com.Question5_Assignment;

//5) Write a program to demonstrate use of @Resource, @Inject, @Required annotations

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Question5 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring_Question5.xml");

		/*
		 * Pass circle to test the Resource annotation and square to check the Required
		 * annotation here
		 */
		Shape shape = (Shape) context.getBean("circle");
		shape.draw();
		/* Inject Annotation */
		EmployeeDetails employeeDetails = (EmployeeDetails) context.getBean("employeeDetails");
		employeeDetails.getEmployeeDetails();

	}
}
