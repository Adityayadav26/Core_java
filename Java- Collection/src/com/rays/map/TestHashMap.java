package com.rays.map;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {
	public static void main(String[] args) {
		
		Map m = new HashMap();
		
		m.put("one", 1);
		m.put("two", 2);
		m.put("three", 3);
		m.put("four", 4);
		m.put("five", 5);
		
		System.out.println(m);
		System.out.println(m.get("two"));
		System.out.println("six key:" + m.containsKey("six"));
		System.out.println("four key :" + m.containsKey("four"));
		System.out.println("six value:" +m.containsValue("six"));
		System.out.println("three value:" +m.containsValue("three"));
		
		System.out.println("-----------");
		
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m.entrySet());
		
		System.out.println("-----------");
		
		System.out.println(m.remove("two"));
		System.out.println(m);
		
		System.out.println("---------");
		m.clear();
		System.out.println(m);
	}

}
