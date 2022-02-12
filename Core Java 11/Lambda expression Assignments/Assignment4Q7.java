import java.util.HashMap;


//Q7. Convert every key-value pair of the map into a string and append them all into a single string, in iteration order. HINT: Use Map.entrySet() method & a StringBuilder to construct the result String.

public class Assignment4Q7 {
	public static void main(String[] args) {
		HashMap<String,Integer> names=new HashMap<String,Integer>();
		names.put("Nitesh",123456);
		names.put("Sourav",651245);
		names.put("Satyam",789456);
		names.put("Tushar",125467);
		names.put("Mohit",654123);
		Assignment4Q7 assignment4q7=new Assignment4Q7();
		System.out.println(assignment4q7.convertKeyValueToString(names));
	}

	public String convertKeyValueToString(HashMap<String, Integer> map) {
		StringBuilder sb = new StringBuilder();
		map.entrySet().forEach(entry->sb.append(entry.getKey()).append(entry.getValue()));
		return sb.toString();
	}
	
}