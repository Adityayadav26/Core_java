package in.co.rasy.basic;

public class ContinueStatment {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				continue;// skip even numbers
			}
			System.out.println("odd Number:" + i);
		}

	}
}
