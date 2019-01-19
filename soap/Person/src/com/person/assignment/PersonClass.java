package com.person.assignment;


public class PersonClass {
	String name;
	int id;
	int age;

	public PersonClass(String name, int id, int age) {
		this.age = age;
		this.name = name;
		this.id = id;
	}
	
	public PersonClass() {
		this.name="abc";
		this.id=1;
		this.age=34;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void updatePerson(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return " \n Name:=" + name + "\n id:=" + id + "\n age=:" + age + "";
	}

}
