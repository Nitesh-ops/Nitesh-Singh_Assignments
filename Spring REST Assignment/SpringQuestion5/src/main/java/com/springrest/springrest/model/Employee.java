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
@Table(name = "employ")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long employeeId;
	
	@Column(name = "employee_name", nullable = false)
	private String employeeName;
	
	@Column(name = "employee_department")
	private String employeeDepartment;
	
	@Column(name = "employee_designation")
	private String employeeDesignation;
	
	@Column(name = "employee_salary")
	private long employeeSalary;
}
