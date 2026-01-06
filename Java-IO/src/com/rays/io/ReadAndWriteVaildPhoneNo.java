package com.rays.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadAndWriteVaildPhoneNo {
	
	public static void main(String[] args) throws Exception{
		
		FileReader source = new FileReader("D:\\IO\\PhoneNo.txt");
		FileWriter Target = new FileWriter("D:\\IO\\ValidPhoneNo.txt");
		
		BufferedReader br = new BufferedReader(source);
		BufferedWriter bw = new BufferedWriter(Target);
		
           String PhoneNo = br.readLine();
		
		while(PhoneNo !=null) {
			
			if (PhoneNo.length() == 10) {
				System.out.println(PhoneNo);
				bw.write(PhoneNo);
				bw.newLine();
			}
			
		PhoneNo = br.readLine();
			
		}
		br.close();
		bw.close();
		
	}

}
