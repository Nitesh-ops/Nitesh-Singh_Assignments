package com.Question3_Assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

class Question03_Test {
	public static void main(String[] args) {

		ApplicationContext context = new FileSystemXmlApplicationContext(
				"C:\\Users\\Nitesh\\eclipse-workspace\\eclipse-workspace\\Spring-Core-Assignment\\src\\test\\resources\\Spring_Question3.xml");
		BankAccountController accountController = (BankAccountController) context.getBean("controller");

		System.out.println("Present Balance in Account 1: " + accountController.getBalance(1161));
		System.out.println("After Deposit in Account 1: " + accountController.deposit(1161, 2000));
		System.out.println("Current Balance in Account 1: " + accountController.getBalance(1161));
		
		/* Here I am Transferring balance from Account 1 to Account 2 */
		System.out.println("\nHere I am Transferring balance from Account 1 to Account 2");
		System.out.println("Present Balance in Account 2: "+accountController.getBalance(1201));
		accountController.fundTransfer(1161, 1201, 8000);
		System.out.println("Current Balance in Account 2: "+accountController.getBalance(1201));

	}
}
