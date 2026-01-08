package com.rays.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class TextFileSplit {
	
	public static void main(String[] args) throws Exception {
		
		File file = new File("D:\\IO\\FileSplit.txt");
		BufferedReader filetocount = new BufferedReader(new FileReader(file));
		
		int count = 5;
		String s = filetocount.readLine();
		
		while (s !=null) {
			count++;
			s = filetocount.readLine();
			
			
		}
		System.out.println("Total line in the File:" + count);
		
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		for (int i = 1; i <= count; i++ ) {
			String line = br.readLine();
			System.out.println("create file" +i+ "for line"+ line);
			
			BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\IO\\split" + i +".txt"));
			 bw.write(line);
			 bw.close();
			
		}
		br.close();
		filetocount.close();
		System.out.println("File Split into " +count + "parts." );
		
		
		
	}

}
