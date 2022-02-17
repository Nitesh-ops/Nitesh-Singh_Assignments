package com.Question3_Assignment;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class BankAccountController implements ApplicationContextAware {
	private ApplicationContext context;

	public double withdraw(long accountId, double balance) {
		double newBalance = 0;
		BankAccountepositoryImpl acc = (BankAccountepositoryImpl) context.getBean("repository");
		if (acc.getBalance(accountId) >= balance)
			newBalance = acc.getBalance(accountId) - balance;
		acc.updateBalance(accountId, newBalance);
		return newBalance;
	}

	public double deposit(long accountId, double balance) {
		BankAccountepositoryImpl acc = (BankAccountepositoryImpl) context.getBean("repository");
		double Newbalance = acc.getBalance(accountId) + balance;
		return acc.updateBalance(accountId, Newbalance);
	}

	public double getBalance(long accountId) {
		BankAccountepositoryImpl bal = (BankAccountepositoryImpl) context.getBean("repository");
		return bal.getBalance(accountId);
	}

	public boolean fundTransfer(long fromAccount, long toAccount, double amount) {
		BankAccountepositoryImpl accountepositoryImpl = (BankAccountepositoryImpl) context.getBean("repository");
		if (accountepositoryImpl.getBalance(fromAccount) >= amount) {
			double updatedAmt = amount + accountepositoryImpl.getBalance(toAccount);

			accountepositoryImpl.updateBalance(fromAccount, accountepositoryImpl.getBalance(fromAccount) - amount);
			accountepositoryImpl.updateBalance(toAccount, updatedAmt);
			return true;
		}
		return false;
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.context = applicationContext;

	}
}
