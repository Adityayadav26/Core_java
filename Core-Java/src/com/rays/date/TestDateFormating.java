package com.rays.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateFormating {
	
	public static void main(String[] args) {
		
		Date date = new Date() ;
		
		System.out.println("date: "+ date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("");
		
		String formatedDate = sdf.format(date);
		
	System.out.println("formatedDate:" + formatedDate);
	
	}

}
