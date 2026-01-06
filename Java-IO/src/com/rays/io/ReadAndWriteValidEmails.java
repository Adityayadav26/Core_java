package com.rays.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadAndWriteValidEmails {
	
	public static void main(String[] args) throws Exception {
		
		FileReader Source = new FileReader("D:\\IO\\Emails.txt");
		FileWriter Target = new FileWriter("D:\\IO\\ValidEmails.txt");
		
		BufferedReader br = new BufferedReader(Source);
		BufferedWriter bw = new BufferedWriter(Target);
		
		
		String email = br.readLine();
		
		while (email !=null ) {
		
		if (email.endsWith("@gmail.com")) {
		System.out.println(email);
		
		bw.write(email);
		bw.newLine();
		
	}
	email = br.readLine();
		}
		bw.close();
		br.close();
	}
}
