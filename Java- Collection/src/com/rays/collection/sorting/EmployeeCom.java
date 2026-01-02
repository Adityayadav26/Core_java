package com.rays.collection.sorting;

public class EmployeeCom implements Comparable<EmployeeCom>{
	
	private int id;
	private String name;
	private int Salary;
	
	public  EmployeeCom (int id , String name, int salary) {
		this.id = id;
		this.name = name;
		this.Salary = salary;
		
		
	}
	@Override
	public String toString() {
		return "id:" + id + " name:" + name + "salary:" + Salary +"\n";
	}

	@Override
	public int compareTo(EmployeeCom o) {
		return this.id - o.id;
		//return this.Salary - o.Salary;
		//return this.name.compareTo(o.name);
	}

}
