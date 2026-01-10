package com.rays.thread.priority;

public class TestPriorityThread {
	
	public static void main(String[] args) {
		
		Thread t1 = new PriorityThread("Ram");
		Thread t2 = new PriorityThread("Shyam");
		
		// set thread priority
		t1.setPriority(10);// Maximum priority
		t2.setPriority(1);// Minimum priority
		
		t1.start();
		t2.start();
	}

}
