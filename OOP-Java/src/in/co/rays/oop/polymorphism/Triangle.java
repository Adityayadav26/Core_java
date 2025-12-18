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
public double area() {
	return((hight * base) / 2);
}

}
