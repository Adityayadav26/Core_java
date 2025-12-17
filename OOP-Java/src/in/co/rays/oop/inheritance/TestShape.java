package in.co.rays.oop.inheritance;

public class TestShape {
	public static void main(String[] args) {

		System.out.println("[circle]");
		
		Circle c = new Circle();

		c.setRadius(6);
		c.setColor("Blue");
		c.setBorderwidth(5);

		System.out.println("radius: " + c.getRadius());
		System.out.println("color: " + c.getColor()); 
		System.out.println("borderWidth: " + c.getBorderwidth()); 
		c.area();

		System.out.println("[Rectangle]");
		
		Rectangle r = new Rectangle();

		r.setlength(4);
		r.setwidth(8);
		r.setColor("Orange");
		r.setBorderwidth(4);

		System.out.println("lenght: " + r.getlength());
		System.out.println("width: " + r.getwidth());
		System.out.println("color: " + r.getColor());
		System.out.println("borderWidth: " + r.getBorderwidth());
		r.area();
		
		System.out.println("[Triangle]");
		
		Triangle t = new Triangle();
	
		t.setBase(4);
		t.setHight(6);
		t.setColor("Yellow");
		t.setBorderwidth(5);

		System.out.println("Base: " + t.getBase());
		System.out.println("Hight: " + t.getHight());
		System.out.println("color: " + t.getColor());
		System.out.println("borderWidth: " + t.getBorderwidth());
		r.area();

	}

}

