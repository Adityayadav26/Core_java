package in.co.rays.oop.inheritance;

public class Triangle extends Shape {
	private int Base;
	private int Hight;

	public int getBase() {
		return Base;
	}

	public void setBase(int base) {
		Base = base;
	}

	public int getHight() {
		return Hight;
	}

	public void setHight(int hight) {
		Hight = hight;
	}

	public void area() {
		System.out.println("area of Triangle: " + 1 * (Base * Hight) / 2);
	}

}

