package com.rays.thread.daemon;

public class TestDaemonThread {
	public static void main(String[] args) {
		
		BackGroundThread t1 = new BackGroundThread("daemon thread");
		
		t1.setDaemon(true);
		
		t1.start();
		
		for(int i = 1; i<=10; i++){
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println(i + "main");
		}
	}

}
