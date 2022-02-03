import java.util.HashSet;
import java.util.Set;

//1) Use a HashSet to hold Employee Objects. Upon running the application, the details of the
//employees added to the HashSet should be displayed.
//Employee <<class>>
// |-- id
// |-- name
// |-- salary
// |-- department
// |-- displayDetails()
//Feel free to add properties and methods to Employee Class
//Note: if we try to store any object other than Employee Object in HashSet, we should not be
//allowed to. 

class Employee{
	private int empid;
	private String name;
	private double salary;
	private String department;
	public Employee(int empid, String name, double salary, String department) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	
	public int getEmpid() {
		return empid;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public void displayDetails() {
		System.out.println("Employee ID "+empid);
		System.out.println("Employee Name "+name);
		System.out.println("Employee Salary "+salary);
		System.out.println("Department "+department);
	}
	
}
public class Question1 {
	public static void main(String[] args) {
		HashSet<Employee> emp=new HashSet<>();
		emp.add(new Employee(1213, "Nitesh",50000,"ASE"));
		emp.add(new Employee(1214, "JK",35000,"SE"));
		for(Employee e : emp){
		    e.displayDetails();
		    System.out.print("\n");
		}
		
		
	}

}
