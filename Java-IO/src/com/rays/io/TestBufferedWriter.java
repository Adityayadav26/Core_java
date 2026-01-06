package com.rays.io;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class TestBufferedWriter {
	
	public static void main(String[] args) throws Exception {
		
		BufferedWriter file = new BufferedWriter(new FileWriter("D:\\IO\\Hello.txt"));
		
		file.write("Public class Hello");
		file.newLine();
		file.write("Public Static void main (String[]args {");
		file.newLine();
		file.write("System.out.println(\"Hello World\");");
		file.newLine();
		file.write("}"+"/"+ "}");
		
		System.out.println("java file write successfully");
		
		file.close();
		
	}

}
