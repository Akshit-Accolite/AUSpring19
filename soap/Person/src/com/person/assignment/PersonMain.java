package com.person.assignment;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class PersonMain {
	static List<PersonClass> lp;

	public static PersonClass createNewPerson(String name, int age, int id) {
		return new PersonClass(name, id, age);
	}

	public static String readPerson() {
		return lp.toString();
	}

	public PersonMain() {
		lp = new CopyOnWriteArrayList<>();
		lp.add(createNewPerson("abc", 12, 1));
		lp.add(createNewPerson("ghi", 23, 3));
		lp.add(createNewPerson("def", 89, 2));
		lp.add(createNewPerson("jkl", 78, 10));
		lp.add(createNewPerson("mno", 25, 9));

	}

	public static String updatePerson(int id, int age, String name) {
		Iterator<PersonClass> itr = lp.iterator();
		while (itr.hasNext()) {
			PersonClass p = itr.next();
			if (p.getId() == id) {
				p.updatePerson(name, age);
				return p.toString();
			}
		}
		return "no match found";
	}

	public String deletePerson(int id) {
		Iterator<PersonClass> itr = lp.iterator();
		while (itr.hasNext()) {
			PersonClass p = itr.next();
			if (p.getId() == id) {
				lp.remove(p);
				return "deleted";
			}
		}
		return "no match found";
	}

	public String readById(int id) {
		Iterator<PersonClass> itr = lp.iterator();
		while (itr.hasNext()) {
			PersonClass p = itr.next();
			if (p.getId() == id) {
				return p.toString();
			}
		}
		return "no match found";
	}
}
