//Q4. Remove the words that have odd lengths from the list. HINT: Use one of the new methods from JDK 8. Use removeIf() method from Collection interface.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Assignment4Q4 {
	public ArrayList<String> removeOddLength(ArrayList<String> employeeList) {
		Predicate<String> delOdd = p -> p.length()%2!=0;
		employeeList.removeIf(delOdd);
		return employeeList;
	}

	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<String>(Arrays.asList("Cherry","Coconut","Jackfruit","Grapes","Guava","Lychee","Mango","Mulberry"));
		Assignment4Q4 assignment4q4=new Assignment4Q4();
		for (String string : assignment4q4.removeOddLength(fruits)) {
			System.out.println(string);
		}
	}
}