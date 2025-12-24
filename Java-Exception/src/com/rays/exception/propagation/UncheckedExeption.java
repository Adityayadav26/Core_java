package com.rays.exception.propagation;

public class UncheckedExeption {
	public static void main(String[] args) {

		dad();

	}

	public static void dad() {

		mom();

	}

	public static void mom() {

		try {
			son();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void son() throws Exception {
		throw new RuntimeException("Make a mistake");
	}

}
