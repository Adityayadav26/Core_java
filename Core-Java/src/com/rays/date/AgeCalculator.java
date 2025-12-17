package com.rays.date;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {
	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		
		System.out.println("today: " + today);
		
		LocalDate birthday = LocalDate.of(2004, 10, 26);
		
		System.out.println("birthday:" + birthday);
		
		Period p = Period.between(today, birthday);
		
		System.out.println("employe age : " + p.getYears());
		System.out.println("month: " + p.getMonths());
		System.out.println("day:" + p.getDays());
	}

}
