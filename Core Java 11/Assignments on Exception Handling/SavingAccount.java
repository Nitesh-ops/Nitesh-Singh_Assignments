import java.util.Scanner;

//3) Write an application to perform withdraw functionality on a SavingAccount object. Point to
//note:
//a. Raise InsufficientBalanceException if you are trying to withdraw more than balance
//or when you balance is zero. E.g. if you balance is 2000 and if you are trying to
//withdraw 2100 or if you balance is 0 and you are trying to withdraw positive value.
//b. Raise IllegalBankTransactionException if you are trying to withdraw a negative value
//from your balance. E.g. if you try to withdraw a negative value savingAcc.withdraw(-
//1000);
//Note: SavingAccount
// |-- long id
// |-- double balance
// |--double withdraw(double amount)
// |--double deposit(double amount) 

class InsufficientBalanceException extends Exception{
	public InsufficientBalanceException(String s) {
		super(s);
	}
}
class IllegalBankTransactionException extends Exception{
	public IllegalBankTransactionException(String s) {
		super(s);
	}
}
public class SavingAccount {
	long id;
	private double balance=5000;
	public SavingAccount(long ID)
	{
		this.id=ID;
	}
	double withdraw(double amount) throws InsufficientBalanceException,IllegalBankTransactionException{
		try {
			if(amount>balance || balance==0)
			{
				throw new InsufficientBalanceException("You can't withdraw more than the amount present in your account");
			}
			else if(amount<0)
			{
				throw new IllegalBankTransactionException("You can't withdraw negative amount");
			}
			balance=balance-amount;
		} catch (InsufficientBalanceException e) {
			e.printStackTrace();
		}
		return balance;
	}
	public double deposit(double amount) {
		balance+=amount;
		return balance;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Do you want to deposit or withdraw(deposit/withdraw): ");
		String opt=sc.next();
		if(opt.equals("deposit"))
		{
			System.out.print("Enter your ID: ");
			long id=sc.nextLong();
			System.out.print("Enter Deposit amount");
			double amount=sc.nextDouble();
			SavingAccount SA=new SavingAccount(id);
			System.out.print("Total balance is: "+SA.deposit(amount));
		}
		else if(opt.equals("withdraw"))
		{
			System.out.print("Enter your ID: ");
			long id=sc.nextLong();
			System.out.print("Enter withdraw amount");
			double amount=sc.nextDouble();
			SavingAccount SA=new SavingAccount(id);
			try {
				System.out.println("Total balance is: "+SA.withdraw(amount));
			} catch (InsufficientBalanceException e) {
				System.out.println(e.getMessage());
			} catch (IllegalBankTransactionException e) {
				System.out.println(e.getMessage());
			}
			finally {
				sc.close();
			}
		}
		
		
		
	}

}
