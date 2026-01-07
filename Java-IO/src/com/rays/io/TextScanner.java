package com.rays.io;

import java.util.Scanner;

public class TextScanner {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//int input
		int intvalue;
		System.out.println("Write any integer value.....");
		intvalue = scan.nextInt();
		System.out.println("Entered Integer:" + intvalue);
		
		
		// float input
		float floatvalue;
		System.out.println("Write any Float value......");
		floatvalue = scan.nextFloat();
		System.out.println("Entered float:" + floatvalue);
		
		// double input
		double doublevalue;
		System.out.println("Write any double value.....");
		doublevalue = scan.nextDouble();
		System.out.println("Entered double:" + doublevalue);
		
		scan.nextLine(); // buffer clear (very important)
		
		// String input (full line)
		String linevalue;
		System.out.println("Write String line value......");
		linevalue = scan.nextLine();
		System.out.println("Entered line :" + linevalue);
		
		// String input (single word)
		String wordvalue;
		System.out.println("Write String Word value......");
		wordvalue = scan.next();
		System.out.println("Entered word:" + wordvalue);
		
		scan.close();
	}

}
