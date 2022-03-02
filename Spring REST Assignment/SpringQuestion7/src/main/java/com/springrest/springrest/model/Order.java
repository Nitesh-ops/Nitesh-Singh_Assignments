package com.springrest.springrest.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Order")
public class Order {

	@Id
	private long orderID;
	private String itemName;
	private int deliveryDate;
	private double orderAmount;
}
