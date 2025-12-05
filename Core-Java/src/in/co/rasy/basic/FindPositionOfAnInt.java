package in.co.rasy.basic;

public class FindPositionOfAnInt {

	public static void main(String[] args) {

		int[] a = { 5, 10, 151, 20, 25, 21, 30, 35, 21 };

		int n = 21;
		int position = -1;

		for (int i = 0; i < a.length; i++) {
			if (n == a[i]) {
				position = i;
				System.out.println("index of " + n + " is " + position);
			}
		}

		if (position == -1) {
			System.out.println("index of " + n + " is " + position);
		}

	}
}
 