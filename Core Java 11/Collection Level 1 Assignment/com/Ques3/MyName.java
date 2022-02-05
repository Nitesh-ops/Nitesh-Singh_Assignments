package com.Ques3;

import java.util.Comparator;

public class MyName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		Employee  e1=(Employee)o1;
		Employee  e2=(Employee)o2;
		String s1=e1.getEmployeeName();
		String s2=e2.getEmployeeName();
		return s1.compareTo(s2);
	}

}
