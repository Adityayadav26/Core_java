package com.rays.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestEmployeeExternalizable {
	
	public static void main(String[] args) throws Exception{
		
		Employee e = new Employee(1, "Ram");
		//Employee e1 = new Employee(2, "Shyam");
		//Employee e2 = new Employee(3, "Pawan");
		
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:\\IO\\Employee.txt"));
		
		out.writeObject(e);
		//out.writeObject(e1);
		//out.writeObject(e2);
		
		out.close();
		
		System.out.println("Object serializable successfully");
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\IO\\Employee.txt"));
		
		System.out.println(in.readObject());
		
		in.close();
	}

}
