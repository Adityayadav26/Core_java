package com.rays.stream;

import java.util.ArrayList;

public class ForEachStream {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Ram");
		list.add("Raman");
		list.add("Aditya");
		list.add("Shyam");
		list.add("Shyam");
		list.add("Sorav");
		list.add("Nikhil");
		
		System.out.println(list);
		
		System.out.println("----foreach methods-----");
		
		list.stream().forEach(System.out::println);
	}

}
