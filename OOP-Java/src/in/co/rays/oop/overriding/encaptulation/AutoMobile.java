package in.co.rays.oop.encaptulation;

public class AutoMobile {
	
	private String color;
	private int speed;
	private String make;
	public static final int NO_OF_GEARS = 5;
	
	public String getColor() {
		return color;
		
	}
	
	public void setColor (String color) {
		this.color = color;
		
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
		
	}
	
	public String getMake() {
		return make;
	}
	
	public void setMake(String make) {
		this.make = make;
		
	}
	
	public void brake(int speed) {
		if (speed==0)
			
		{
			System.out.println("Car is alreay in stop mode");
		}else {
			speed = speed-10;
			System.out.println("Speed After Applying Brake:" + speed);
		}
	}
	public void changesGear(int gear) {
		if (gear> NO_OF_GEARS) {
			System.out.println("Invalid gear");
		}else {
			gear = gear + 0;
			System.out.println("Current Gear:" + gear);
		}
	}
	
	public void acceletor(int speed) {
		if (speed==300|| speed > 300) {
			System.out.println("Warning Speed Limit is Crossed");
		}else {
			speed = speed+10;
			System.out.println("After Acceletor Speed:" + speed);
		}
	}
	
	public static int getNoOfGares() {
		return NO_OF_GEARS;
	}

}
