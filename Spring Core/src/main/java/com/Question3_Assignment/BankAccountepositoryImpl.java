package com.Question3_Assignment;

public class BankAccountepositoryImpl implements BankAccountRepository {
	private BankAccount account1;
	private BankAccount account2;

	public void BankAccountepositoryImpl() {
	}

	public BankAccountepositoryImpl(BankAccount account1, BankAccount account2) {
		super();
		this.account1 = account1;
		this.account2 = account2;
	}

	@Override
	public double getBalance(long accountId) {
		if (account1.getAccountId() == accountId) {
			return account1.getAccountBalance();
		}
		return account2.getAccountBalance();
	}
	
	@Override
	public double updateBalance(long accountId, double newBalance) {
		double updatedBalance = 0;
		if (account1.getAccountId() == accountId) {
			updatedBalance = newBalance;
			account1.setAccountBalance(updatedBalance);
		} else {
			updatedBalance = newBalance;
			account2.setAccountBalance(updatedBalance);
		}
		return updatedBalance;
	}
}
