package com.rays.collection;

import java.util.ArrayList;
import java.util.Collections;

public class TestListSortingAndShuffling {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("Aditya");
		list.add("Satayam");
		list.add("Abishish");
		list.add("Durgesh");
		// list.add(24); // compilation error

		System.out.println(list);

		System.out.println("------------");

		Collections.sort(list);
		System.out.println(list);
		
		System.out.println("-----------");
		
		Collections.shuffle(list);
		System.out.println(list);
	}

}
