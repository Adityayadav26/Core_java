package com.rays.thread.daemon;

public class BackGroundThread extends Thread{
	
	String name = null;
	
	public BackGroundThread(String name) {
		this.name = name;
		
	}
	
	@Override
	public void run() {
		
		while(true) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		System.out.println(name);	
		}
	}

}
