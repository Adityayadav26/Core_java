package in.co.rasy.basic;

public class SecondIargestNo {
	public static void main(String[] args) {
		int[] num = { 30, 20, 100, 50, 60, 65, };
		int temp = 0;
		int secLargest = 0;

		for (int i = 0; i < num.length; i++) {
			if (temp < num[i]) {
				secLargest = temp;
				temp = num[i];
			}
			if (secLargest < num[i] && temp > num[i]) {
				secLargest = num[i];
			}
		}
		System.out.println("second Largest no in array:" + secLargest);
	}
}
