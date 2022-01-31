//1) Write an application to append the following strings “StringBuilder”, “is a peer class of 
//String”, “that provides much of “, “the functionality of strings” using a StringBuilder.

public class Question1 {
	public static void main(String[] args) {
		StringBuilder txt = new StringBuilder("StringBuilder");
		txt.append(" is a peer class of String");
		txt.append(" that provides much of");
		System.out.print(txt.append(" the functionality of strings"));
	}

}
