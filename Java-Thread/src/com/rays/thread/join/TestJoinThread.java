package com.rays.thread.join;

public class TestJoinThread {
	
	public static void main(String[] args) {
		
		JoinThread t1 = new JoinThread("Ram");
		JoinThread t2 = new JoinThread("Shyam");
		
		t1.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
		
		for(int i = 1; i<= 10; i++) {
			System.out.println(i+"=" + "main");
		}
	}

}
