package com.springrest.springrest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long customerId;
	
	@Column(name = "customer_name", nullable = false)
	private String customerName;
	
	@Column(name = "account_type", nullable = false)
	private String accountType;
	
	@Column(name = "phone_number")
	private long phoneNumber;
	
	@Column(name = "customer_address")
	private String customerAddress;

}
