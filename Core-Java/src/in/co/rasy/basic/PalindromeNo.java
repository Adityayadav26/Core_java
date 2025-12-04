package in.co.rasy.basic;

public class PalindromeNo {
	public static void main(String[] args) {
		int temp = 231;
		int n = temp;
		int r = 0;
		int reverseNo = 0;

		while (n > 0) {
			r = n % 10;
			reverseNo = (reverseNo * 10) + r;
			n = n / 10;
		}
		System.out.println(reverseNo);
		if (temp == reverseNo) {
			System.out.println("palindrome");
		} else {
			System.out.println("not palindrome");
		}
	}
}
