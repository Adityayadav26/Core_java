package com.rays.exception;

public class TestArithmeticWithTryCatch {

	public static void main(String[] args) {

		int a = 0;
		int b = 5;

		try {
			int div = b / a; // ArithmeticException in try block
			System.out.println(div);
		} catch (ArithmeticException e) { // handle in catch block
			System.out.println("exception:" + e.getMessage());
		}

		System.out.println("program is finish");
	}

}
