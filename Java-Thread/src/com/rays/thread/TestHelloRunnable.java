package com.rays.thread;

public class TestHelloRunnable {
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new HelloRunnable("Aditya"));
		Thread t2 = new Thread(new HelloRunnable("Alok"));
		
		t1.start();
		t2.start();
		
	}

}
