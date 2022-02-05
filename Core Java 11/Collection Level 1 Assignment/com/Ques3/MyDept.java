package com.Ques3;

import java.util.Comparator;

public class MyDept implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		Employee  e1=(Employee)o1;
		Employee  e2=(Employee)o2;
		String s1=e1.getDepartment();
		String s2=e2.getDepartment();
		return s1.compareTo(s2);
	}

}
