package com.rays.collection.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class TestMarksheet {
	
	public static void main(String[] args) {
		
		Marksheet m1 = new Marksheet("Ram", 101, 45);
		Marksheet m2 = new Marksheet("Kamal", 102, 50);
		Marksheet m3 = new Marksheet("Shyam", 103, 99);
		Marksheet m4 = new Marksheet("Aditya", 106, 38);
		Marksheet m5 = new Marksheet("Rawan", 104, 88);
		Marksheet m6 = new Marksheet("Pawan", 105, 90);
		
		ArrayList<Marksheet> list = new ArrayList<Marksheet>();
		
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		list.add(m5);
		list.add(m6);
		
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
	}

}
