package in.co.rasy.basic;

public class TestArray {
	public static void main(String[] args) {
		int[] a = { 5, 10, 15, 20, 25, 30, 35, 40 };

		System.out.println(a[0] + "," + a[1] + "," + a[2]);
		System.out.println(a[0] + a[1] + a[2]);

		System.out.println("length of a:" + a.length);
		System.out.println("-------------");
		for (int i = 0; i < a.length; i++) {
			System.out.println(i + "=" + a[i]);
		}

		System.out.println("-----------");
		for (int b : a) {
			System.out.println(b);
		}
	}
}
