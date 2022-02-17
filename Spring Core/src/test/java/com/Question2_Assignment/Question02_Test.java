package com.Question2_Assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Question02_Test {
	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext(
				"C:\\Users\\Nitesh\\eclipse-workspace\\eclipse-workspace\\Spring-Core-Assignment\\src\\test\\resources\\Spring_Question2.xml");
		
		System.out.println("***************Using List***************");
		Question_List question_List=(Question_List)context.getBean("ansList");
		question_List.solutions();
		
		System.out.println("\n***************Using Set***************");
		Question_Set question_Set=(Question_Set)context.getBean("ansSet");
		question_Set.solutions();
		
		System.out.println("\n***************Using Map***************");
		Question_Map question_Map=(Question_Map)context.getBean("ansMap");
		question_Map.solutions();
		
		
	}

}
