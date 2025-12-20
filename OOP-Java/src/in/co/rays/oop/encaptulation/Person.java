package in.co.rays.oop.encaptulation;

import java.util.Date;

public class Person {
	
	private String name;
	private Date DOB;
	private String address;
	
	public String getName() {
		return this.name;
		
	}
	
	public void setName(String name) {
		this.name= name;
	}
	
	public Date getDOB() {
		return this.DOB;
		
	}
	public void setDOB(Date DOB) {
		this.DOB = DOB;
		
	}
	
	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getAge(Date DOB) {
		Date now = new Date();
		
		@SuppressWarnings("deprecation")
		int Age = DOB.getYear()- now.getYear();
		
		return Age;
	}

}
