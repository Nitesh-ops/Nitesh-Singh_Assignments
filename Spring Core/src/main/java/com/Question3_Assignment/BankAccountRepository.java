package com.Question3_Assignment;

public interface BankAccountRepository {
	public double getBalance(long accountId);

	public double updateBalance(long accountId, double newBalance);

}
