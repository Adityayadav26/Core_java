package com.rays.collection.sorting;

public class Marksheet implements Comparable<Marksheet> {
	
	private String name;
	private int rOLLNo;
	private int phy;
	
	public Marksheet(String name , int rollNo , int phy) {
		this.name = name;
		this.rOLLNo = rollNo;
		this.phy = phy;
		
	}
	@Override
	public String toString() {
		return "\n name:" + name +  "|rollNo:" + rOLLNo +   "|phy:" + phy + "\n";
	}
	
	@Override
	public int compareTo(Marksheet o) {
		//return this.rOLLNo - o.rOLLNo;
		//return this.phy - o.phy;
		return this.name.compareTo(o.name);
	}

}
