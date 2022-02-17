package com.Question8_Assignment;

/*8) Write a Java program to demonstrate InitializingBean and DisposableBean.
Try Different ways:
(Use init-method and destroy-method in xml config file)
(Use @PostConstruct and @PreDestroy)*/


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Question8 {
	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("Spring_Question8.xml");
		context.registerShutdownHook();
		Triangle triangle=(Triangle)context.getBean("triangle");
		triangle.draw();
	}
}
