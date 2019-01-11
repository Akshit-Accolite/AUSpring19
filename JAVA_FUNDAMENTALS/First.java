package com.helloworld;

public class First {

	public static void main(String[] args) {

		Manager obj = new Manager(1, "hello", 10000);
		String name = obj.getName();
		System.out.println(name);
		int id = obj.getId();
		System.out.println(id);

		System.out.println(Employee.getCount());

		Employee e = new Manager(2, "ram", 7806);
		System.out.println(e.getId());

	}
	
	//covariant return type
	
	Employee getEmployeeDetails(Employee e) {
		return e;
	}
}

class Employee {
	static String company_name;
	
	static{
		company_name="Accolite";
	}
	
	{
		System.out.print("Creating a new Employee");
	}
	
	int id;
	int salary;
	String name;
	static int count;
	int app;

	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.app=0;
		count++;
	}

	public int getId() {
		return this.id;
	}
	
	public void calAppraisel(int years) {
		try {
			app=(this.salary/years);
		}
		catch(ArithmeticException e) {
			System.out.println("not eligible");
		}
		finally {
			System.out.println("Appraisel:-"+app);
		}
	}

	public int getSalary() {
		return this.salary;
	}

	public String getName() {
		return this.name;
	}

	public static int getCount() {
		return count;
	}
		
}

class Manager extends Employee {

	public Manager(int id, String name, int salary) {
		super(id, name, salary);
	}

	@Override
	public int getId() {
		System.out.println("In Manager");
		return this.id;
	}

}

class Hr extends Employee {

	public Hr(int id, String name, int salary) {
		super(id, name, salary);
	}

	@Override
	public String getName() {
		System.out.println("In Hr");
		return this.name;
	}
}