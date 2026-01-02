package com.rays.collection.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class TestEmployeeComarable {

	public static void main(String[] args) {

		EmployeeCom e1 = new EmployeeCom(2, "Ram", 80000);
		EmployeeCom e2 = new EmployeeCom(3, "Aditya", 90000);
		EmployeeCom e3 = new EmployeeCom(1, "Saman", 4000);
		EmployeeCom e4 = new EmployeeCom(6, "Kamal", 55550);
		EmployeeCom e5 = new EmployeeCom(4, "Mohal", 3000);
		EmployeeCom e6 = new EmployeeCom(5, "Nitin", 75000);

		ArrayList<EmployeeCom> list = new ArrayList<EmployeeCom>();

		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);

		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}

}
