import java.util.Scanner;

//1) Write an application that accepts two numbers, divides the first number with the second
//number and display the result. Hint: You need to handle ArithmeticException which is
//thrown when there is an attempt to divide a number by zero. 

public class Question1 {
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter Dividend: ");
			int dividend=sc.nextInt();
			System.out.print("Enter Divisior: ");
			int divisor=sc.nextInt();
			try {
				System.out.print(dividend/divisor);
			} catch (ArithmeticException e) {
				System.out.println("Oops you can't divide number by 0");
			}
			finally {
				sc.close();
			}
			
		}
}
