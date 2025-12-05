package in.co.rasy.basic;

public class TestString {
	public static void main(String[] args) {
		String n = "Aditya Yadav";

		System.out.println(n.length());
		System.out.println(n.charAt(5));
		System.out.println(n.indexOf("i"));
		System.out.println(n.indexOf("t"));
		System.out.println(n.lastIndexOf("a"));
		System.out.println(n.replace('i', 'a'));
		System.out.println(n.toLowerCase());
		System.out.println(n.toUpperCase());
		System.out.println(n.startsWith("Aditya"));
		System.out.println(n.endsWith("dav"));
		System.out.println(n.substring(4));
	}
}
