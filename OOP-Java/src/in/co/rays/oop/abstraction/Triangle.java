package in.co.rays.oop.abstraction;

public class Triangle extends Shape {
	private int lenght;
	private int width;

	public int getLength() {
		return lenght;
	}

	public void setLenght(int lenght) {
		this.lenght = lenght;

	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public double area() {

		return lenght * width;
	}
}
