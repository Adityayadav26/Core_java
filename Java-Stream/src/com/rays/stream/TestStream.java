package com.rays.stream;

import java.util.ArrayList;
import java.util.Comparator;

public class TestStream {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Ram");
		list.add("Lucky");
		list.add("Aditya");
		list.add("Suraj");
		list.add("Saman");
		list.add("Uday");
		list.add("Aditya");
		list.add("Abhay");
		
		list.forEach(System.out::println);
		
		System.out.println("-----------");// sorted method
		list.stream().sorted().forEach(System.out::println);
		
		System.out.println("----------");// sorted to reverse method
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		System.out.println("----------");//use distinct to remove dupalicate 
		list.stream().sorted().distinct().forEach(System.out::println);
		
		System.out.println("---map method---");
		list.stream().map(e-> e.toLowerCase()).forEach(System.out::println);
		System.out.println("---------");
		list.stream().map(e-> e.toUpperCase()).distinct().forEach(System.out::println);
		
		System.out.println("----filter method----");
		list.stream().filter(e-> e.startsWith("A")).distinct().forEach(System.out::println);
		
		
	}

}
