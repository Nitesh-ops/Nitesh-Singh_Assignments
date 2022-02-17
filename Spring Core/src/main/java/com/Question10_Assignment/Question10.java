package com.Question10_Assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Question10 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring_Question10.xml");
		CompanyName companyName = (CompanyName) context.getBean("companyName");
		System.out.println(companyName.getEmployeeName("emp")+" works in "+companyName.getCompanyName());
	}

}
