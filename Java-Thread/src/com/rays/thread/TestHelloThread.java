package com.rays.thread;

public class TestHelloThread {

	public static void main(String[] args) {

		Thread t1 = new HelloThread("Ram");
		Thread t2 = new HelloThread("Shyam");

		t1.start();
		t2.start();

		for (int i = 1; i <= 12; i++) {

			System.out.println(i + "=" + "main Thread");
		}
	}
}
