package com.Question5_Assignment;

import javax.inject.Inject;

public class EmployeeDetails {
	
	@Inject
	Employee employee;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public void getEmployeeDetails() {
		System.out.println("Employee Details: ");
		System.out.println("Employee ID: "+employee.getEmployeeNo());
		System.out.println("Employee Name: "+employee.getEmployeeName());
	}
}
