import java.util.HashSet;
import java.util.Iterator;

//2)	Write an application to store 10 unique product objects. In case there is an attempt to add a duplicate product, it should be silently rejected. Hint: Use HasSet or TreeSet
//Extra(optional): Use ArrayList in the above solution. (This is optional)

public class Question2 {
	public static void main(String[] args) {
		HashSet<String> product = new HashSet<String>();
		product.add("Mango");
		product.add("Apple");
		product.add("Onion");
		product.add("Banana");
		product.add("Grapes");
		product.add("Mango"); // Repeated Element
		product.add("Onion"); // Repeated Element
		product.add("Potato");
		product.add("Brinjal");
		product.add("Guvava");
		
		
		 Iterator<String> it = product.iterator();
		 while (it.hasNext()) {
			String string =it.next();
			System.out.println(string);
			
		}
	}
}
