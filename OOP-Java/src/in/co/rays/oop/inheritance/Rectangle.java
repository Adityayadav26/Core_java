package in.co.rays.oop.inheritance;

public class Rectangle extends Shape{
	private int length;
	private int width;

	public int getlength() {
		return length;
	}

	public void setlength(int length) {
		this.length = length;
	}

	public int getwidth() {
		return width;
	}

	public void setwidth(int width) {
		this.width = width;
	}

	public void area() {
		System.out.println("area of rectangle: " + (length * width));
	}

}

