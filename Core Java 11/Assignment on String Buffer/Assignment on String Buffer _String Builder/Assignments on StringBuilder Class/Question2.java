//2) Insert the following string “insert text” into the string “It is used to _ at the specified index
//position” at the location denoted by the sign _

public class Question2 {
	public static void main(String[] args) {
		StringBuilder txt = new StringBuilder("It is used to ");
		System.out.print(txt.insert(14,"insert text"));
		
	}

}
