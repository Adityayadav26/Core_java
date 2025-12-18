package in.co.rays.oop.constructor;

import java.util.Date;

public class Person {
	protected String name;
	protected String address;
	protected Date dob;
	public static final int AVG_AGE = 18;

	public Person(String name, String address, Date dob) {

		this.name = name;
		this.address = address;
		this.dob = dob;

	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public Date getDob() {
		return dob;
	}

	public int getAge(Date DOB) {
		Date now = new Date();

		int age = now.getYear() - DOB.getYear();
		if (age >= AVG_AGE && age <= 60) {
			System.out.println("Elegible for vote");
		} else {
			System.out.println("Not elegible for vote");

		}

		return age;

	}

}


