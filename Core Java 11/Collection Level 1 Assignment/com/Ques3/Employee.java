package com.Ques3;
//3)	Store at least 10 Employee Objects in an TreeSet<Employee>. When the application runs the user should be asked to select one of the options upon which you will print the employee details in a sorted manner.
//For E.g.
//Run Application:
//a)	ID
//b)	Name
//c)	Department
//d)	Salary
//Your choice: b
//<Should print all the employee’s details sorted by name>

public class Employee implements Comparable<Employee>{
	private Integer employeeId;
	private String employeeName;
	private String department;
	private Double salary;
	
	
	public Employee(Integer employeeId, String employeeName, String department, Double salary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.department = department;
		this.salary = salary;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public String getDepartment() {
		return department;
	}

	public Double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", department=" + department
				+ ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee o) {
		return this.getEmployeeId().compareTo(o.getEmployeeId());
	}
}
