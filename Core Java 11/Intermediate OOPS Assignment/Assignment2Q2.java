import java.util.ArrayList;

class Manager extends Assignment2Q2 {
	@Override
	public int getSalary(int salary) {
		int incentive = 5000;
		return salary + incentive;
	}
}

class Labour extends Assignment2Q2 {
	@Override
	public int getSalary(int salary) {
		int overtime = 500;
		return salary + overtime;
	}
}

public class Assignment2Q2 {
	static int salary = 10000;

	public int getSalary(int salary) {
		return salary;
	}

	public static int totalEmployeesSalary(ArrayList<Integer> employeeSalaries) {
		int totalSalary = 0;
		for (Integer integer : employeeSalaries) {
			totalSalary += integer;
		}
		return totalSalary;

	}

	public static void main(String[] args) {
		Manager manager = new Manager();
		int managerSalary = manager.getSalary(salary);

		Labour labour = new Labour();
		int labourSalary = labour.getSalary(salary);
		ArrayList<Integer> Employee = new ArrayList<Integer>();
		Employee.add(managerSalary);
		Employee.add(labourSalary);
		System.out.println("Total salary of all employee is: " + totalEmployeesSalary(Employee));

	}
}