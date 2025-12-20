package in.co.rays.oop.constructor;

public class Parent {

	private String name;
	private String address;
	private int salary;

	public Parent() {
		System.out.println("default constructor: Parent ");
	}

	public Parent(String name) {
		this(); // call default Constructor
		this.name = name;
		System.out.println("name: " + this.name);
	}

	public Parent(String name, String address) {
		this(name); // call Single Parameterized Constructor
		this.address = address;
		System.out.println("address: " + this.address);
	}

	public Parent(String name, String address, int salary) {
		this(name, address); // call double Parameterized Constructor
		this.salary = salary;
		System.out.println("salary:" + this.salary);
	}

}
