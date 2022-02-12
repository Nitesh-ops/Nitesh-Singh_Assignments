//3. “A quick brown fox jumps over the lazy dog”. Create an ArrayList from the given
//String. Such an ArrayList should include each word from the given sentence. Finally
//convert such List to an array using Java 11 methods and print the output. 

import java.util.ArrayList;
import java.util.Arrays;

public class Question3 {

	public static void main(String[] args) {
		String str = "A quick brown fox jumps over the lazy dog";
		ArrayList<String> strList = new ArrayList<String>(Arrays.asList(str.split(" ")));
		String[] strArray = strList.toArray(n -> new String[n]); // Converted from Arraylist to Array(type:String) using
																	// Java 1 features
		System.out.println(Arrays.toString(strArray));

	}

}
