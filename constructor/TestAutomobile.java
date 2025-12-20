package in.co.rays.oop.constructor;

public class TestAutomobile {
	public static void main(String[] args) {
		Automobile m = new Automobile("White", "TATA-i10", 120);

		System.out.println("Color: " + m.getColor());
		System.out.println("Mkae: " + m.getMake());
		System.out.println("Speed: " + m.getSpeed());
		m.brake(50);
		m.changeGear(3);
		m.acceletor(60);
	}

	}


