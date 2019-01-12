package com.advanced.java;

import java.util.*;

public class Company_details {
	ArrayList<Company> comp = new ArrayList<>();

	public static void main(String args[]) {
		Company c1 = new Company("a", "city1", "state1");
		Company_details cd=new Company_details();
		c1.addEmp();
		c1.getEmp();
		c1.dispSortedEmp();
		cd.findComp("city1");

	}

	public void findComp(String city_name) {
		int count = 0;
		System.out.println();
		System.out.println("Finding Companies...");
		comp.add(new Company("a", "city1", "state1"));
		comp.add(new Company("b", "city1", "state1"));
		comp.add(new Company("c", "city2", "state1"));
		comp.add(new Company("d", "city2", "state1"));
		comp.add(new Company("e", "city3", "state1"));
		comp.add(new Company("g", "city2", "state1"));
		comp.add(new Company("h", "city1", "state1"));

		Iterator<Company> itr = comp.iterator();
		while (itr.hasNext()) {
			Company c = itr.next();
			int var = city_name.compareTo(c.address.city);
			if (var == 0) {
				count++;
				System.out.println("Company Name: " + c.name + " city: " + c.address.city);
			}
		}

		if (count == 0) {
			System.out.println("no company found!!");
		}
	}
}
