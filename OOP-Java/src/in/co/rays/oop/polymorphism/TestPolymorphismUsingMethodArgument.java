package in.co.rays.oop.polymorphism;

public class TestPolymorphismUsingMethodArgument {

	public static void main(String[] args) {

		Shape[] s = new Shape[3];

		s[0] = new Circle();
		s[1] = new Rectangle();
		s[2] = new Triangle();

		Circle c = (Circle) s[0];
		c.setRadius(5);

		Rectangle r = (Rectangle) s[1];
		r.setLenght(5);
		r.setwidth(4);

		Triangle t = (Triangle) s[2];
		t.setBase(6);
		t.setHight(7);

		getArea(s);

	}

	public static void getArea(Shape[] s) {
		double totalArea = 0.0;
		for (int i = 0; i < s.length; i++) {

			System.out.println(s[i].area());
			totalArea = totalArea + s[i].area();
		}

		System.out.println("totalArea: " + totalArea);

	}
}
