package com.skillsoft.ioexception;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Finally {

	public static void main(String[] args) {
		
		BufferedReader br = null;
		
		try {
			
			File file = new File("C:\\Users\\252008\\Documents\\workspace-spring-tool-suite-4-4.14.0.RELEASE\\exceptions\\myfile.txt");
			
//			File file = new File("fileDoesNotExists.txt");
			
			 br = new BufferedReader(new FileReader(file));
			
			String st = br.readLine();
			
			while(st != null) {
				System.out.println(st);
				
				st = br.readLine();
			}
		}catch(IOException e) {
			
			System.out.println("Exception Caught " + e);
		}
		
		finally {
			
			if(br != null) {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Close the bufferedReader in the finally block");
			}
			
			else {
				System.out.println("The bufferedReader was never opened");
			}
		}
	}
	
}
