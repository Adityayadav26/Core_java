package in.co.rasy.basic;

public class TestCalculator {
public static void main(String[] args) {
	
	String opr ="%";
	int a =6;
	int b =5;
	
	switch (opr) {
	
	case "+":
	System.out.println("results" + ( a+ b ));
	break;
	
	case"-":
		System.out.println("results" + ( a-b));
		break;
		
	case"*":
		System.out.println("results" + (a*b));
		break;
		
	case "/":
		System.out.println("results" + (a/b));
		break;
		
	case "%":
		System.out.println("results" + (a%b));
		break;
	}
}
}
