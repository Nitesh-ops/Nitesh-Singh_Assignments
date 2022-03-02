package com.springrest.springrest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
	private int id;
	private String firstName;
	private String lastName;
	private String street;
	private String city;
	private String state;
	private String zip;
	private String country;
}
