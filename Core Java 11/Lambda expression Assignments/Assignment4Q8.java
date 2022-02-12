import java.util.Arrays;

//Q8. Create a new thread that prints the numbers from the list. Use class Thread & interface Consumer.

public class Assignment4Q8 {
	public static void main(String[] args) {
		Thread thread=new Thread(()->Arrays.asList(100,200,300,400,500,600,700,800,900,1000).forEach(System.out::println));
		thread.start();
	}

}
