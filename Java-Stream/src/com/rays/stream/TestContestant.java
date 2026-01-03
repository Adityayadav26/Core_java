package com.rays.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class TestContestant {
	
	public static void main(String[] args) {
		
		ArrayList<Contestant> list = new ArrayList<Contestant>();
		
		list.add(new Contestant("Ram", "9367286478"));
		list.add(new Contestant("Shayam", "8764232564"));
		list.add(new Contestant("Aditya", "7806075340"));
		list.add(new Contestant("Kamal", "9367286478"));
		list.add(new Contestant("Pawan", "9547898765"));
		list.add(new Contestant("Sahail", "8760855783"));
		list.add(new Contestant("Invaild", "9354874"));
		
		//get PhoneNo
		list.stream().map(e-> e.phoneNo).forEach(System.out::println);
		
		System.out.println("-----------");
		
		// get vaild phoneNo
		list.stream().map(e-> e.phoneNo).filter(e-> e.length()==10).forEach(System.out::println);
		
		System.out.println("-----------");
		
		// remove duplicate PhoneNo
		list.stream().map(e-> e.phoneNo).filter(e-> e.length()==10).distinct().forEach(System.out::println);
		
		System.out.println("-----------");
		
		//shuffle PhoneNo
		
		list.stream().map(e-> e.phoneNo).filter(e-> e.length()==10).distinct().collect(Collectors.collectingAndThen(Collectors.toList(), e->{
	
			Collections.shuffle(e);
			return e.stream();
			
		})).limit(3).forEach(System.out::println);
		
	}
		

}
