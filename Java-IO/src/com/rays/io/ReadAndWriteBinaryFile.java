package com.rays.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadAndWriteBinaryFile {
	
	public static void main(String[] args) throws Exception {
		
		String source = "D:\\IO\\sinchane.webp";
		
		String target = "D:\\IO\\sinchane.webp .txt";
		
		FileInputStream in = new FileInputStream(source); // read binary
		
		FileOutputStream out = new FileOutputStream(target); // write binary
		
		int i = in.read();
		
		while(i != -1) {
			
			System.out.println(i);

			out.write(i);
			
			i = in.read();
		}
		
		in.close();
		out.close();
		System.out.println("successfully");
		
		
		
	}

}
