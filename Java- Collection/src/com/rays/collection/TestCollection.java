package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
	
	public static void main(String[] args) {
		
		Collection c = new ArrayList();
		
		c.add("Aditya");
		c.add(26);
		c.add(1.2);
		c.add('a');
		c.add(true);
		c.add("Yadav");
		
		System.out.println(c);
		System.out.println(c.contains(1.2));
		System.out.println(c.size());
		System.out.println(c.remove(1.2));
		System.out.println(c.size());
		System.out.println(c.contains(1.2));
		
		
		System.out.println("-----------------");
		
		for(Object o : c) {
			
			System.out.println(o);
		}
	}

}
