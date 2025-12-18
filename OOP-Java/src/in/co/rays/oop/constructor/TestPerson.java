package in.co.rays.oop.constructor;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		Person p = new Person("Gagan Pal", "Ahemdabad", sdf.parse("2000-07-12"));

		System.out.println("Name: " + p.getName());
		System.out.println("Address: " + p.getAddress());
		System.out.println("DOB: " + p.getDob());
		System.out.println("Age: " + p.getAge(p.getDob()));
	}

}
