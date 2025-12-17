package in.co.rays.oop.encaptulation;

public class TestAutoMobile {
	public static void main(String[] args) {
		AutoMobile Car1= new AutoMobile();
		
		Car1.setColor("red");
		Car1.setMake("kia");
		Car1.setSpeed(200);
		
		
		System.out.println("Car Color:" + Car1.getColor());
		System.out.println("Car Build Model:" + Car1.getMake());
		System.out.println("Car Maximum Speed:" +Car1.getSpeed());
		Car1.brake(45);
		Car1.changesGear(3);
		Car1.acceletor(60);
		
	}

}
