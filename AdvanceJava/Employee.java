package com.advanced.java;



public class Employee implements Comparable{
	int id;
	String e_name;
	int age;

	public Employee(int id, String e_name, int age) {
		this.age = age;
		this.id = id;
		this.e_name = e_name;
	}

	public int getAge() {
		return age;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setE_name(String e_name) {
		this.e_name = e_name;
	}

	public int getId() {
		return id;
	}

	public String getE_name() {
		return e_name;
	}

	@Override
	public int compareTo(Object o) {
		if(this.age>((Employee) o).getAge()) {
			return 1;
		}
		else if(this.age<((Employee) o).getAge()){
			return -1;
		}
		else 
			return 0;
	}

}
