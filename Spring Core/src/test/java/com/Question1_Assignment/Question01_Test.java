package com.Question1_Assignment;

/*1) Create an Address class with the following attributes:- street, city, state, zip, country
Create an Customer class with the following attributes:- customerId, customerName,
customerContact, customerAddress.
Inject the Address bean into Customer bean using setter injection
Create a Test class with main() method, get Customer bean from ApplicationContext
object and print details of Customer.
Also write the JUnit Test cases for above program.
- Modify the above application and inject the bean using constructor injection
- Use XML based Configuraion.*/

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

class Question01_Test {
	public static void main(String[] args) {

		ApplicationContext context = new FileSystemXmlApplicationContext(
				"C:\\Users\\Nitesh\\eclipse-workspace\\eclipse-workspace\\Spring-Core-Assignment\\src\\test\\resources\\Spring_Question1.xml");
		Customer customer = (Customer) context.getBean("custDetail");
		customer.customerDetails();

		CustomerConstructorInjection constructorInjection = (CustomerConstructorInjection) context
				.getBean("custDetailConstructor");
		constructorInjection.customerDetails();

	}

}
