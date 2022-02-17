package com.Question1_Assignment;

public class Customer {
	private int customerId;
	private String customerName;
	private String customerContact;
	private Address cusAddress;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerContact() {
		return customerContact;
	}

	public void setCustomerContact(String customerContact) {
		this.customerContact = customerContact;
	}

	public Address getCusAddress() {
		return cusAddress;
	}

	public void setCusAddress(Address cusAddress) {
		this.cusAddress = cusAddress;
	}

	void customerDetails() {
		System.out.println("Customer [customerId=" + customerId + "\n customerName=" + customerName
				+ "\n customerContact=" + customerContact + "\n cusAddress=" + cusAddress + "]");
	}
	

}
