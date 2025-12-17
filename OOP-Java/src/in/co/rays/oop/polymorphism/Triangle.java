package in.co.rays.oop.polymorphism;

public class Triangle extends Shape {
	
	private int hight;
	private int base;
	
	public int getHight() {
		return hight;
	}
	
	public void setHight(int hight) {
		this.hight = hight;
		
	}
	
	public int getBase() {
		return base;
	}
	
	public void setBase(int base){
		this.base = base;
	}
	
 @Override
public void area() {
	System.out.println("area of triangle:" +((hight * base) / 2));
}

}
