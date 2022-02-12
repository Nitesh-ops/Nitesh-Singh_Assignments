
// Q6. Replace every word in the list with its upper case equivalent. Use replaceAll() method & Unary Operator interface.
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

class convert implements UnaryOperator<String> {
	public String apply(String str) {
		return str.toUpperCase();
	}
}

public class Assignment4Q6 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("cherry", "coconut", "jackfruit", "Grapes", "Guava", "lychee", "mango",
				"mulberry");
		Assignment4Q6 assignment4q6=new Assignment4Q6();
		System.out.println(assignment4q6.convertToUpperCase(list));
	}

	public List<String> convertToUpperCase(List<String> list) {
		list.replaceAll(new convert());
		return list;
	}
}