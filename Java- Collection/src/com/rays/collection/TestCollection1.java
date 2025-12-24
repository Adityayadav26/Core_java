package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection1 {

	public static void main(String[] args) {

		// creates a collection
		Collection c = new ArrayList();

		// Add elements into Collection
		c.add("Bura mat Dekho"); // Index 0
		c.add("Bura mat Suno"); // Index 1
		c.add("Bura mat Kaho"); // Index 2

		System.out.println("Lenght Of Collection:" + c.size());
		System.out.println(c);

		System.out.println("----------");

		for (Object o : c) {
			System.out.println(o);
		}

		System.out.println("----------");

		// Convert collection into array
		Object[] oArray = c.toArray();

		// Print all elements of array
		for (Object o : oArray) {
			String s = (String) o;
			System.out.println(s);
		}
	}

}
