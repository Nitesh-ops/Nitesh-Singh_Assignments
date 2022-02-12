//Q5. Create a string that consists of the first letter of each word in the list of Strings provided. HINT: Use Consumer interface & a String Builder to construct the result.

import java.util.Arrays;
import java.util.List;

public class Assignment4Q5 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");
		System.out.println(Assignment4Q5.processWords(list));

	}
	public static String processWords(List<String> list){
		StringBuilder sb=new StringBuilder(); 
		list.forEach(word->sb.append(word.charAt(0)));
		return sb.toString();
	}
}