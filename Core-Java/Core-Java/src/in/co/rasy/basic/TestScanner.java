package in.co.rasy.basic;

import java.util.Scanner;

public class TestScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first int ......");
		int a = sc.nextInt();

		System.out.println("enter second int .....");
		int b = sc.nextInt();

		System.out.println("your first int is :" + a);
		System.out.println("your second int is:" + b);

		System.out.println("seclect your one opr....(+,-,*,/,%,)");
		String opr = sc.next();

		switch(opr) {
		
		case "+":
			System.out.println("results:" +(a+b));
			break;
			
		case "-":
			System.out.println("results:" +(a-b));
			break;
			
		case "*":
			System.out.println("results:" +(a*b));
			break;
			
		case "/":
			System.out.println("results:" +(a/b));
			break;
			
		case "%":
			System.out.println("results:" +(a%b));
		}
	}
}
