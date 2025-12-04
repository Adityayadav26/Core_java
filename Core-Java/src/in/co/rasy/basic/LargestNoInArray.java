package in.co.rasy.basic;

public class LargestNoInArray {
	public static void main(String[] args) {
		int[] a = { 5, 10, 15, 225, 45, 50, 55 };
		int largestNo = 0;
		for (int i : a) {
			if (i > largestNo) {
				largestNo = i;
			}
		}
		System.out.println("largestNo is :" + largestNo);
	}
}
