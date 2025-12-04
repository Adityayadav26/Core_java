package in.co.rasy.basic;

public class FindPositionOfAnInt {
	public static void main(String[] args) {
		int[] a = { 5, 10, 151, 20, 25, 30, 35 };
		int n = 20;
		int index = -1;
		for (int i = 0; i < a.length; i++) {
			if (n == a[i]) {
				index = i;
				System.out.println(n + "=" + index);
			}
		}
		if (index == -1) {
			System.out.println(index);
		}
	}
}
