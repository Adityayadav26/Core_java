package in.co.rays.oop.abstraction;

public class TestShape {
	public static void main(String[] args) {
		
		Shape s1 = new Circle ();
		
		Circle c = (Circle) s1;
		c.setRadius(4);
		
		System.out.println("circle ");
	}

}
