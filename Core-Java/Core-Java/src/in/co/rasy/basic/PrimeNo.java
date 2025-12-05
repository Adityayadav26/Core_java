package in.co.rasy.basic;

public class PrimeNo {
	public static void main(String[] args) {
		int n = 7;
		int count = 0;
		for (int i = 2; i < n; i++) {

			if (n % i == 0) {
				count++;
			}
		}
		System.out.println("count;" + count);
		if (count > 0) {
			System.out.println("not prime");
		} else {
			System.out.println("prime");
		}
	}
}
