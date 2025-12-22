package com.rays.exception;

public class TestMultyCatchBlock {
	
	public static void main(String[] args) {
		
		String name = null;
		
		try {
			System.out.println(name.length());
			System.out.println(name.charAt(4));
		}catch (NullPointerException e) {
			System.out.println("exception in catch1:" + e.getMessage());
		}catch(IndexOutOfBoundsException e) {
			System.out.println("exception in catch2:" + e.getMessage());
		}
	}

}
