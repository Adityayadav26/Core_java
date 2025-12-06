package in.co.rasy.basic;

public class TestBuffer {
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer ("Aditya yadav");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println(sb.charAt(4));
		System.out.println(sb.replace(1, 2,"A"));
		System.out.println(sb.reverse());
		System.out.println(sb.indexOf("a"));
		System.out.println(sb);

		
	}

}
