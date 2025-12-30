package com.rays.map;

import java.util.HashMap;
import java.util.Map;

//1. map contain key and value pair
//2. in map key represent value
//3. map contain unique key only
//4. map contain duplicate value
//5. map contain only one null key
//6. map contain multiple null value
public class TestMap {
	
	public static void main(String[] args) {
		
		Map m = new HashMap();		
		
		m.put("one", 1); // one = 1
		m.put("Two", 2);// Two = 2
		m.put("Three", 3);// Three = 3
		m.put("Four", 4);// Four = 4
		m.put("Five", 5);//Five = 5
		
		System.out.println(m);
		System.out.println(m.get("Three"));
		System.out.println(m.containsKey("Six"));//contain check key members
		System.out.println(m.containsKey("Two"));
		System.out.println(m.containsValue(6));// contain check value  members
		System.out.println(m.containsValue(5));
		
		System.out.println("----------------");
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m.entrySet());
		
		System.out.println("-----------");
		System.out.println(m.remove("Five"));
		System.out.println(m);
		m.clear();
		System.out.println(m);
	}

}
