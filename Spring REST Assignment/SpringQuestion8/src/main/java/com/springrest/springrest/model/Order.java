package com.springrest.springrest.model;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "OrderDetails")
public class Order {
	
	private int id;
	private float total;
	private Date date;
	private Customer customer;

	public void addLineItem(LineItem lineItem) {

	}

	public void removeLineItem(LineItem lineItem) {

	}
	public LineItem[] getLineItems() {
		return null;
		
	}
}
