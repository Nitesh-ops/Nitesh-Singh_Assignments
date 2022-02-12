package assignment5Q3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Trader {
	private String name;
	private String city;

	public Trader(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}
}

public class Assignment5Q3 {
	public static List<String> printUniqueCities(List<Trader> traders) {
		List<String> distinctTraders = traders.stream().map(t -> t.getCity()).distinct().collect(Collectors.toList());
		return distinctTraders;

	}

	public static List<String> tradersFromPuneSortByName(List<Trader> traders) {
		List<String> traderPune = traders.stream().filter(t -> t.getCity().equals("Pune")).map(t -> t.getName())
				.collect(Collectors.toList());
		return traderPune;
	}

	public static String allTrader3Names(List<Trader> traders) {
		String traderName = traders.stream().map(t -> t.getName()).sorted().reduce("", (n1, n2) -> n1 + " " + n2);
		return traderName;
	}

	public static ArrayList<Trader> areAnyTradersFromIndore(ArrayList<Trader> traders) {
		ArrayList<Trader> traderIndore= traders.stream().filter(t->t.getCity().equals("Indore")).collect(Collectors.toCollection(ArrayList::new));
		return traderIndore;
	}

	public static void main(String[] args) {
		List<Trader> traders = new ArrayList<Trader>(Arrays.asList(new Trader("Nitesh", "Gurgaon"),
				new Trader("Vikash", "Pune"), new Trader("Abhishsek", "Pune"), new Trader("Mohit", "Delhi"),
				new Trader("Akshay", "Mumbai"), new Trader("Anirban", "Delhi"), new Trader("Ram", "Pune"),new Trader("Jagadesh", "Indore")));

		System.out.println("What are all the unique cities where the traders work?\n" + printUniqueCities(traders));

		List<String> str = tradersFromPuneSortByName(traders);
		Collections.sort(str);
		System.out.println("\nFind all traders from Pune and sort them by name.\n" + str);

		System.out.println("\nReturn a string of all traders’ names sorted alphabetically. \n" + allTrader3Names(traders));

		System.out.println("\nAre any traders based in Indore? ");
		areAnyTradersFromIndore(new ArrayList<Trader>(traders)).forEach(Trader -> System.out.println(Trader.getName() + ","+Trader.getCity()));
		

	}
}