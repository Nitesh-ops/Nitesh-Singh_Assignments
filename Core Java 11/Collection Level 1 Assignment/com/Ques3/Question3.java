package com.Ques3;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Question3 {
	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		Employee emp1=new Employee(1161,"Nitesh","MCA",50000.0);
		Employee emp2=new Employee(2456,"Anirban","BTECH",60000.0);
		Employee emp3=new Employee(1458,"Vikash","BBA",45000.0);
		Employee emp4=new Employee(1857,"Jagadesh","MBA",47000.0);
		Employee emp5=new Employee(1954,"Abhishek","MTECH",38000.0);
		Employee emp6=new Employee(4587,"Ram","BCA",90000.0);
		Employee emp7=new Employee(1455,"Happy","MECH",42000.0);
		Employee emp8=new Employee(7850,"Nobita","BPHARMA",350000.0);
		Employee emp9=new Employee(2478,"Jiyan","LLB",42500.0);
		Employee emp10=new Employee(7890,"Sizuka","ELEC",145800.0);
		
		System.out.print("Please enter on what basis you want to sort the result: ");
		System.out.println("\na) ID\nb) Name\nc) Department\nd) Salary"); 
		char choice=sc.next().charAt(0);
		if(choice=='a') {
			TreeSet<Employee> empdet=new TreeSet<>();
			empdet.add(emp1);
			empdet.add(emp2);
			empdet.add(emp3);
			empdet.add(emp4);
			empdet.add(emp5);
			empdet.add(emp6);
			empdet.add(emp7);
			empdet.add(emp8);
			empdet.add(emp9);
			empdet.add(emp10);
			
			System.out.println("Sorted by ID: ");
			
			Iterator<Employee> itr = empdet.iterator();
			 while (itr.hasNext()) {
				Employee string =itr.next();
				System.out.println(string);
			}
		}else if(choice=='b')
		{
			TreeSet<Employee> empdetName=new TreeSet<>(new MyName());
			empdetName.add(emp1);
			empdetName.add(emp2);
			empdetName.add(emp3);
			empdetName.add(emp4);
			empdetName.add(emp5);
			empdetName.add(emp6);
			empdetName.add(emp7);
			empdetName.add(emp8);
			empdetName.add(emp9);
			empdetName.add(emp10);
			
			System.out.println("Sorted by Name: ");
			
			Iterator<Employee> itr = empdetName.iterator();
			 while (itr.hasNext()) {
				Employee string =itr.next();
				System.out.println(string);
			}
			
		}
		else if(choice=='c')
		{
			TreeSet<Employee> empdetDept=new TreeSet<>(new MyDept());
			empdetDept.add(emp1);
			empdetDept.add(emp2);
			empdetDept.add(emp3);
			empdetDept.add(emp4);
			empdetDept.add(emp5);
			empdetDept.add(emp6);
			empdetDept.add(emp7);
			empdetDept.add(emp8);
			empdetDept.add(emp9);
			empdetDept.add(emp10);
			
			System.out.println("Sorted by Department: ");
			
			Iterator<Employee> itr = empdetDept.iterator();
			 while (itr.hasNext()) {
				Employee string =itr.next();
				System.out.println(string);
			}
			
		}
		else if(choice=='d')
		{
			TreeSet<Employee> empdetSalary=new TreeSet<>(new MySalary());
			empdetSalary.add(emp1);
			empdetSalary.add(emp2);
			empdetSalary.add(emp3);
			empdetSalary.add(emp4);
			empdetSalary.add(emp5);
			empdetSalary.add(emp6);
			empdetSalary.add(emp7);
			empdetSalary.add(emp8);
			empdetSalary.add(emp9);
			empdetSalary.add(emp10);
			
			System.out.println("Sorted by Salary: ");
			
			Iterator<Employee> itr = empdetSalary.iterator();
			 while (itr.hasNext()) {
				Employee string =itr.next();
				System.out.println(string);
			}
		}
				
		sc.close();
	}

}
