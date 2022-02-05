package com.Ques3;

import java.util.Comparator;

public class MySalary  implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		Employee  e1=(Employee)o1;
		Employee  e2=(Employee)o2;
		Double s1=e1.getSalary();
		Double s2=e2.getSalary();
		return s1.compareTo(s2);
	}

}
