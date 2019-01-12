package com.advanced.java;

import java.util.*;

public class Company {

	String name;
	Address address;
	TreeSet<Employee> emp;

	Company(String name, String city, String state) {
		address = new Address(city, state);
		this.name = name;
		emp = new TreeSet<>();
	}

	public void addEmp() {
		emp.add(new Employee(1, "raman", 20));
		emp.add(new Employee(2, "aman", 30));
		emp.add(new Employee(3, "ram", 29));
		emp.add(new Employee(4, "chahal", 43));
		emp.add(new Employee(5, "sandy", 24));
		emp.add(new Employee(6, "sham", 34));
		emp.add(new Employee(7, "varun", 36));
		emp.add(new Employee(8, "shan", 50));
		emp.add(new Employee(9, "sam", 26));
		emp.add(new Employee(10, "kamal", 25));
	}

	public void getEmp() {
		System.out.println();
		System.out.println("....Employees age less than 30....");
		Iterator<Employee> itr = emp.iterator();
		while (itr.hasNext()) {
			Employee e = itr.next();
			if (e.age < 30) {
				System.out.println("name: " + e.e_name + " age: " + e.age + " ");
			}
		}
	}

	public void dispSortedEmp() {
		Iterator<Employee> itr = emp.iterator();
		System.out.println();
		System.out.println("....Sorted Employees....");
		while (itr.hasNext()) {
			Employee e = itr.next();
			System.out.println("name: " + e.e_name + " age: " + e.age + " ");
		}
	}
}
