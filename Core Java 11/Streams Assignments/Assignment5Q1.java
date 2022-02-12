//Setup:
//Create the following classes:
//class Fruit { String name; int calories; int price; String color; }
//Display the following:
//1. Display the fruit names of low calories fruits i.e. calories < 100 sorted in descending order of calories.
//2. Display color wise list of fruit names.
//3. Display only RED color fruits sorted as per their price in ascending order.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Fruit {
	private String name;
	private int calories;
	private int price;
	private String color;

	public Fruit(String name, int calories, int price, String color) {
		super();
		this.name = name;
		this.calories = calories;
		this.price = price;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public int getCalories() {
		return calories;
	}

	public int getPrice() {
		return price;
	}

	public String getColor() {
		return color;
	}

}

public class Assignment5Q1 {
	public static List<String> reverseSort(ArrayList<Fruit> fruits) {
		List<String> sortedList1 = fruits.stream().filter(p -> p.getCalories() < 100).sorted(new onCalories())
				.map(p -> p.getName()).collect(Collectors.toList());
		return sortedList1;
	}

	public static ArrayList<Fruit> sort(ArrayList<Fruit> Fruits) {
		ArrayList<Fruit> sortedList2 = Fruits.stream().sorted(new onColor())
				.collect(Collectors.toCollection(ArrayList::new));
		return sortedList2;
	}

	public static ArrayList<Fruit> filterRedSortPrice(ArrayList<Fruit> fruits) {
		ArrayList<Fruit> sortedList3 = fruits.stream().filter(p -> p.getColor().equals("Red")).sorted(new onPrice())
				.collect(Collectors.toCollection(ArrayList::new));
		return sortedList3;
	}

	public static void main(String[] args) {
		ArrayList<Fruit> fr = new ArrayList<Fruit>(Arrays.asList(new Fruit("Apple", 52, 80, "Red"),
				new Fruit("Orange", 47, 60, "Orange"), new Fruit("Banana", 89, 40, "Red"),
				new Fruit("Grapes", 101, 120, "Green"), new Fruit("Guava", 112, 180, "White")));

		System.out.println(
				"Display the fruit names of low calories fruits i.e. calories < 100 sorted in descending order of calories.");
		System.out.println(reverseSort(fr));

		System.out.println("\nDisplay color wise list of fruit names.");
		sort(fr).forEach(Fruit -> System.out.println(
				Fruit.getName() + ", " + Fruit.getCalories() + ", " + Fruit.getPrice() + ", " + Fruit.getColor()));

		System.out.println("\nDisplay only RED color fruits sorted as per their price in ascending order.");
		filterRedSortPrice(fr).forEach(Fruit -> System.out.println(Fruit.getColor() + ", " + Fruit.getPrice()));

	}

}