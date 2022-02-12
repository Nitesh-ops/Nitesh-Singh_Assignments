package assignment5Q4;

import java.util.*;
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

class Transaction {
	private Trader trader;
	private int year;
	private int value;

	public Transaction(Trader trader, int year, int value) {
		super();
		this.trader = trader;
		this.year = year;
		this.value = value;
	}

	public Trader getTrader() {
		return trader;
	}

	public int getYear() {
		return year;
	}

	public int getValue() {
		return value;
	}
}

public class Assignment5Q4 {
	public static List<Transaction> sortTransactions(List<Transaction> transactions) {
		List<Transaction> trans2011 = transactions.stream().filter(t -> (t.getYear() == 2011)).sorted(new ByValue())
				.collect(Collectors.toList());
		return trans2011;
	}

	public static List<Integer> transactionsValuesDelhi(List<Transaction> transactions) {

		List<Integer> transDelhi = transactions.stream().filter(t -> t.getTrader().getCity().equals("Delhi"))
				.map(t -> t.getValue()).collect(Collectors.toList());
		return transDelhi;
	}

	public static int highestTransaction(List<Transaction> transactions) {
		int max = transactions.stream().map(Transaction::getValue).max(Integer::compare).get();
		return max;
	}

	public static int smallestTransaction(List<Transaction> transactions) {
		int min = transactions.stream().map(Transaction::getValue).min(Integer::compare).get();
		return min;
	}

	public static void main(String[] args) {
		Trader Nitesh = new Trader("Nitesh", "Gurgaon");
		Trader Vikash = new Trader("Vikash", "Pune");
		@SuppressWarnings("unused")
		Trader Abhishek = new Trader("Abhishsek", "Pune");
		@SuppressWarnings("unused")
		Trader Mohit = new Trader("Mohit", "Delhi");
		Trader Akshay = new Trader("Akshay", "Delhi");
		Trader Anirban = new Trader("Anirban", "Delhi");
		Trader Ram = new Trader("Ram", "Pune");
		@SuppressWarnings("unused")
		Trader Jagadesh = new Trader("Jagadesh", "Indore");

		List<Transaction> trasanctionList = new ArrayList<Transaction>(
				Arrays.asList(new Transaction(Vikash, 2015, 800), new Transaction(Nitesh, 2013, 700),
						new Transaction(Vikash, 2013, 1500), new Transaction(Anirban, 2012, 950),
						new Transaction(Ram, 2011, 450), new Transaction(Akshay, 2011, 850)));

		System.out.println("Find all transactions in the year 2011 and sort them by value (small to high).");
		sortTransactions(trasanctionList)
				.forEach(Transaction -> System.out.println("Name: " + Transaction.getTrader().getName() + ","
						+ " Value: " + Transaction.getValue() + "," + " Year: " + Transaction.getYear()));

		System.out.println("\nPrint all transactions’ values from the traders living in Delhi.");
		List<Integer> transDelhi = transactionsValuesDelhi(trasanctionList);
		System.out.println(transDelhi);

		System.out.println("\nWhat’s the highest value of all the transactions?");
		System.out.println("Highest Value: " + highestTransaction(trasanctionList));

		System.out.println("\nFind the transaction with the smallest value.");
		System.out.println("Smallest Value: " + smallestTransaction(trasanctionList));

	}
}