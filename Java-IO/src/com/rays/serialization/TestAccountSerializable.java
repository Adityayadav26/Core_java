package com.rays.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestAccountSerializable {
	public static void main(String[] args) throws Exception{
		
		Account a = new Account("84647998478238", 84675.00);
		
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:\\IO\\Account.txt"));
		
		//convert Account class object into byte stream : serialization
		out.writeObject(a);
		
		out.close();
		System.out.println("Object serialized successfully");
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\IO\\Account.txt"));
		
		// convert byte stream into account class object desrialization
		System.out.println(in.readObject());
		
		in.close();
		
		
	}

}
