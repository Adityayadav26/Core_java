package in.co.rays.oop.constructor;

public class Automobile {
	protected String color;
	protected String make;
	protected int speed;
	public static final int NO_OF_GEARS = 5;

	public Automobile(String color, String make, int speed) {
		this.color = color;
		this.make = make;
		this.speed = speed;
	}

	public String getColor() {
		return color;
	}

	public String getMake() {
		return make;
	}

	public int getSpeed() {
		return speed;
	}

	public void brake(int speed) {
		if (speed == 0)

		{
			System.out.println("Car is alreay in stop mode");
		} else {
			speed = speed - 10;
			System.out.println("Speed After Applying Brake: " + speed);
		}
	}

	public void changeGear(int gear) {
		if (gear > NO_OF_GEARS) {
			System.out.println("Invalid gear");
		} else {
			gear = gear + 0;
			System.out.println("Current Gear: " + gear);
		}
	}

	public void acceletor(int speed) {
		if (speed == 300 || speed > 300) {
			System.out.println("Warning Speed Limit is Crossed");
		} else {
			speed = speed + 10;
			System.out.println("After Acceletor Speed: " + speed);

		}
	}

	public static int getNoOfGares() {
		return NO_OF_GEARS;
	}


}
