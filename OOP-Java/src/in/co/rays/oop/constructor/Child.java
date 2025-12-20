package in.co.rays.oop.constructor;

public class Child extends Parent {

	public Child() {
		super(); // Call Parent Class default Constructor
	}

	public Child(String name) {
		super(name); // Call Parent Class Single Parameterized Constructor
	}

	public Child(String name, String address) {
		super(name, address); // Call Parent Class double Parameterized Constructor
	}

	public Child(String name, String address, int salary) {
		super(name, address, salary); // Call Parent triple Parameterized ConstructorS
	}

}
