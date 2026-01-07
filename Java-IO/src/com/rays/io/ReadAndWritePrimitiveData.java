package com.rays.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadAndWritePrimitiveData {
	
	public static void main(String[] args) throws Exception{
		
		DataOutputStream out = new DataOutputStream(new FileOutputStream("D:\\IO\\Primitive.txt"));
		
		out.writeInt(2);
		out.writeBoolean(false);
		out.writeDouble(2.2);
		out.writeChar('A');
		
		out.close();
		
		System.out.println("primitive data added");
		
		DataInputStream in = new DataInputStream(new FileInputStream("D:\\IO\\Primitive.txt"));
		
		System.out.println(in.readInt());
		System.out.println(in.readBoolean());
		System.out.println(in.readDouble());
		System.out.println(in.readChar());
		
		in.close();
		
		
	}

}
