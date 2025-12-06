package in.co.rasy.basic;

public class TestStr {
	public static void main(String[] args) {
 
		String n = "Vijay Dinanath Chauhan";
		
		System.out.println(n.length());
		System.out.println(n.charAt(8));
		System.out.println(n.indexOf("n"));
		System.out.println(n.lastIndexOf("C"));
		System.out.println(n.replace('i', 'c'));
		System.out.println(n.toLowerCase());
		System.out.println(n.toUpperCase());
		System.out.println(n.startsWith("Vi"));
		System.out.println(n.endsWith("an"));
		System.out.println(n.substring(6));
	}
}
