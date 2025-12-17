package in.co.rays.oop.polymorphism;

public class Rectangle extends Shape {
	
	private int lenght;
	private int width;
	
	public int getLenght() {
		return lenght;
	}
	
	public void setLenght(int lenght) {
		this.lenght = lenght;
	}
	
	public int getWidht() {
		return width;
	}
	
	public void setwidth(int width) {
		this.width = width;
	}
	
	@Override
	public void area() {
		System.out.println("area of rectangle:" + (lenght * width));
	}

}
