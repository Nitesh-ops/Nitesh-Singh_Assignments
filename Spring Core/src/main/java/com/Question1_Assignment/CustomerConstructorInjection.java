package com.Question1_Assignment;

public class CustomerConstructorInjection {
	private int customerId;
	private String customerName;
	private String customerContact;
	private Address cusAddress;
	public void CustomerConstructorInjection() {}

	public CustomerConstructorInjection(int customerId, String customerName, String customerContact,
			Address cusAddress) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerContact = customerContact;
		this.cusAddress = cusAddress;
	}

	public int getCustomerId() {
		return customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getCustomerContact() {
		return customerContact;
	}

	public Address getCusAddress() {
		return cusAddress;
	}

	void customerDetails() {
		System.out.println("Customer [customerId=" + customerId + "\n customerName=" + customerName
				+ "\n customerContact=" + customerContact + "\n cusAddress=" + cusAddress + "]");
	}

}
