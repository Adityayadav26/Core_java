package com.rays.map;

import java.util.SortedMap;
import java.util.TreeMap;


//SortedMap order map in asc order
public class TestSortedMap {
	public static void main(String[] args) {
		
		SortedMap m = new TreeMap();
		
		m.put("one", 1);
		m.put("two", 2);
		m.put("three", 3);
		m.put("four", 4);
		m.put("five", 5);
		
		System.out.println(m);
		System.out.println(m.get("four"));
		System.out.println(m.containsKey("seven"));
		System.out.println(m.containsKey("one"));
		System.out.println(m.containsValue(7));
		System.out.println(m.containsValue(3));
		
		System.out.println("---------------");
		System.out.println(m.keySet());
		System.out.println(m.remove("one"));
		System.out.println(m.entrySet());
		
		System.out.println("-------");
		
	}

}
