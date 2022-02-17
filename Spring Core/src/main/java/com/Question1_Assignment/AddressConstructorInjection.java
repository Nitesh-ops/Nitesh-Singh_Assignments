package com.Question1_Assignment;

public class AddressConstructorInjection {
	private int street;
	private String city;
	private String state;
	private int zip;
	private String country;

	public void AddressConstructorInjection() {
	}

	public AddressConstructorInjection(int street, String city, String state, int zip, String country) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
	}

	public int getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public int getZip() {
		return zip;
	}

	public String getCountry() {
		return country;
	}

	@Override
	public String toString() {
		return "AddressConstructorInjection [street=" + street + ", city=" + city + ", state=" + state + ", zip=" + zip
				+ ", country=" + country + "]";
	}

}
