package com.Question3_Assignment;

public class BankAccountServiceImpl implements BankAccountService {
	BankAccountepositoryImpl bankAccountepositoryImpl;
	
	@Override
	public double withdraw(long accountId, double balance) {
		return 0;
	}
	@Override
	public double deposit(long accountId, double balance) {
		return 0;
	}
	@Override
	public double getBalance(long accountId) {
		return 0;
	}
	@Override
	public boolean fundTransfer(long fromAccount, long toAccount, double amount) {
		return false;
	}

}
