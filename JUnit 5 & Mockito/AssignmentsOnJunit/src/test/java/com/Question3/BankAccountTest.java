package com.Question3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BankAccountTest {

	@Test
	void balanceWithdraw() {
		BankAccount wd = new BankAccount();
		assertThrows(InsufficientFundsExpcetion.class, () -> wd.withdraw(21000),
				"Should throw exception if balance is less than the withdrawl amount");
	}
}
