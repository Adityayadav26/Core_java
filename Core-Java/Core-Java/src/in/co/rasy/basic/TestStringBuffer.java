package in.co.rasy.basic;

public class TestStringBuffer {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Aditya Yadav");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println(sb.charAt(0));
		System.out.println(sb.indexOf("Aditya"));
		System.out.println(sb.replace(5, 9, "dav"));
		System.out.println(sb.reverse());

	}
}
