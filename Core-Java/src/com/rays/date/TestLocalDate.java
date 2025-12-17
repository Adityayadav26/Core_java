package com.rays.date;

import java.time.LocalDate;

public class TestLocalDate {
	public static void main(String[] args) {
		
		LocalDate now = LocalDate.now(); // current localDate
		
		System.out.println("date: " + now);
		System.out.println("day of week: " + now.getDayOfWeek());
		System.out.println("day of month: "+ now.getDayOfMonth());
		System.out.println("day of yeatr: " + now.getDayOfYear());
		System.out.println("year: "+ now.getYear());
		System.out.println("month: " + now.getMonth());
		
		
		System.out.println("---------------------");
		
		LocalDate dob = LocalDate.of(2004, 10, 26);
		
		System.out.println("dob date: " + dob);
		System.out.println("dob day of week: " + dob.getDayOfWeek());
		System.out.println("dob day of month: " + dob.getDayOfMonth());
		System.out.println("dob day of year: " + dob.getDayOfYear());
		System.out.println("dob year: "+ dob.getYear());
		System.out.println("dob month: " + dob.getMonth());
		
		System.out.println();
	}

}
