package in.co.rasy.basic;

public class ArmstorngNo {
	public static void main(String[] args) {
		int temp = 146;
		int n = temp;
		int r = 0;
		int armstrongNo = 0;

		while (n > 0) {
			r = n % 10;
			armstrongNo = armstrongNo + r * r * r;
			n = n / 10;
		}
		System.out.println(armstrongNo);
		if (temp == armstrongNo) {
			System.out.println("armstrong no");
		} else {
			System.out.println("not armstrong");
		}
	}
}
