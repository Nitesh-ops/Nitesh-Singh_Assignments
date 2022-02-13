import java.util.ArrayList;

class CurrentAccount extends Assignment2Q3 {
	int totalDeposits = 10000;
	int creditLimit = 2000;

	@Override
	public int getCash() {
		return totalDeposits - creditLimit;
	}
}

class SavingsAccount extends Assignment2Q3 {
	int totalDeposits = 10000;
	int fixedDepositAmount = 5000;

	@Override
	public int getCash() {
		return totalDeposits + fixedDepositAmount;
	}
}

public class Assignment2Q3 {
	public static int totalCashInBank(ArrayList<Integer> cash) {
		int totalAmount = 0;
		for (Integer integer : cash) {
			totalAmount += integer;
		}
		return totalAmount;
	}

	public int getCash() {
		return 0;
	}

	public static void main(String[] args) {
		CurrentAccount currentAccount = new CurrentAccount();
		int currentcash = currentAccount.getCash();

		SavingsAccount savingsAccount = new SavingsAccount();
		int savingcash = savingsAccount.getCash();
		ArrayList<Integer> cashArrayList = new ArrayList<>();
		cashArrayList.add(currentcash);
		cashArrayList.add(savingcash);
		System.out.println("Toal cash is: " + totalCashInBank(cashArrayList));

	}
}