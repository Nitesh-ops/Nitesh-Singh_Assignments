//1. Write a program to calculate the Simple Interest with minimal code using features of
//Java 11.
//Hint: Use the concept of functional interface and Local variable syntax for lambda parameters

@FunctionalInterface
interface Interest {
	int simpleInterest(int prinicipal, int time, int rate);
}

public class Question1 {
	public static void main(String[] args) {
		Interest SI = (var prinicipal, var time, var rate) -> (prinicipal * time * rate) / 100;
		System.out.println("Simple Interest is: " + SI.simpleInterest(5000, 2, 10));

	}

}
