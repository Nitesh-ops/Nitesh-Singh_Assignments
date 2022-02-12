//1. Write an application to perform basic arithmetic operations like add, subtract, multiply & divide. You need to define a functional interface first.

interface Add{
	public double addition(int num1, int num2);
}
interface Subtract
{
	public double subtraction(int num1, int num2);
}
interface Multiply{
	public double multiplication(int num1, int num2);
}
interface Divide{
	public double division(int num1, int num2);
}
public class Assignment4Q1 {

	public static void main(String[] args) {
		Add add=(a,b)->(a+b);
		System.out.println("Addition: "+add.addition(13, 5));
		
		Subtract subt=(a,b)->(a-b);
		System.out.println("subtraction: "+subt.subtraction(13, 5));

		Multiply mult=(a,b)->(a*b);
		System.out.println("multiplication: "+mult.multiplication(13, 5));
		
		Divide div=(a,b)->(a/b);
		System.out.println("division: "+div.division(13, 5));
	}

}
