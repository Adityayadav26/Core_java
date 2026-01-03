package com.rays.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamHigherSalary {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(3000);
		list.add(5000);
		list.add(1000);
		list.add(8000);
		list.add(2000);
		
		System.out.println("----first Largest Salary----");
		list.stream().sorted(Collections.reverseOrder()).distinct().limit(1).forEach(System.out::println);
		
		System.out.println("----Second Largest Salary----");
		list.stream().sorted(Collections.reverseOrder()).distinct().skip(1).limit(1).forEach(System.out::println);
	}

}
