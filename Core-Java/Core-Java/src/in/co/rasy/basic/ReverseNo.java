package in.co.rasy.basic;

public class ReverseNo {
	public static void main(String[] args) {
		int n = 123;
		int r = 0;
		int reverseNo = 0;

		while (n > 0) {
			r = n % 10;
			reverseNo = (reverseNo * 10) + r;
			n = n / 10;
		}
		System.out.println(reverseNo);
	}

}
