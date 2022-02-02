import java.util.Scanner;

//2) Carrying forward with the above problem, handle ArithmeticException by raising
//UnsupportedOperationException as a solution.

public class Question2 {
	public static int divideInt(int dividend,int divisor) {
		if(divisor==0)
		{
				throw new UnsupportedOperationException("Divisor can't be 0");	
		}
		return dividend/divisor;
	}
		
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			try {
				System.out.print("Enter Dividend: ");
				int dividend=sc.nextInt();
				System.out.print("Enter Divisior: ");
				int divisor=sc.nextInt();
				System.out.print(divideInt(dividend,divisor));
			} catch (UnsupportedOperationException e) {
				System.out.print(e.getMessage());
			}finally {
				sc.close();
			}
			
		}
}
