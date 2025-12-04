package in.co.rasy.basic;

import java.util.Random;

public class RandamNumber {
	public static void main(String[] args) {
		Random r = new Random();
		for (int i = 0; i < 5; i++) {

			int a = r.nextInt(1000);

			System.out.println(a);

		}
	}
}
