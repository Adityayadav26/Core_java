package in.co.rays.oop.overriding;

public class TestShapeOverriding {

	public static void main(String[] args) {
		
		Shape s1 = new Circle();

		Circle c = (Circle) s1;
		c.setColor("Yellow");
		c.setBorderWidth(8);
		c.setRadius(10);

		System.out.println("color: " + c.getColor());
		System.out.println("borderWidth: " + c.getBorderWidth());
		System.out.println("radius: " + c.getRadius());
		c.area();

		System.out.println("----------------------------------------");

		Shape s2 = new Triangle();

		Triangle t = (Triangle) s2;
		t.setColor("Orange");
		t.setBorderWidth(5);
		t.setBase(6);
		t.setHight(12);

		System.out.println("color: " + t.getColor());
		System.out.println("borderWidth: " + t.getBorderWidth());
		System.out.println("base: " + t.getBase());
		System.out.println("hight: " + t.getHight());
		t.area();

		System.out.println("------------------------------------------");

		Shape s3 = new Rectangle();

		Rectangle r = (Rectangle) s3;
		r.setColor("Green");
		r.setBorderWidth(7);
		r.setLength(5);
		r.setWidth(9);

		System.out.println("color: " + r.getColor());
		System.out.println("borderWidth: " + r.getBorderWidth());
		System.out.println("length: "+ r.getLength());
		System.out.println("width: " + r.getWidth());
		r.area();
	}


	}

