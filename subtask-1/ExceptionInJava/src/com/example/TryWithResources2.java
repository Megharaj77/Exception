package com.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResources2 {

//	public static void main(String[] args) throws IOException{
//		
//		File fileIn = new File("C:\\Users\\252008\\Documents\\workspace-spring-tool-suite-4-4.14.0.RELEASE\\exceptions\\somefile.txt");
//		
//		try(BufferedReader br = new BufferedReader(new FileReader(fileIn))) {
//			
//			String st = null;
//			
//			while((st = br.readLine()) !=null) {
//				System.out.println(st);
//			}
//		}catch (IOException e) {
//			System.out.println("Catch and handle exception: " + e);
//		}
//	}
	
	
	
	
	
public static void main(String[] args) throws IOException{
		
		File fileIn = new File("C:\\Users\\252008\\Documents\\workspace-spring-tool-suite-4-4.14.0.RELEASE\\exceptions\\myfile.txt");
		File fileOut = new File("C:\\Users\\252008\\Documents\\workspace-spring-tool-suite-4-4.14.0.RELEASE\\exceptions\\otherfile.txt");
		
		try(BufferedReader br = new BufferedReader(new FileReader(fileIn));
				BufferedWriter bw = new BufferedWriter(new FileWriter(fileOut))) {
			
			bw.write("This is another copy!\n");
			
			String st = null;
			
			while((st = br.readLine()) !=null) {
				System.out.println(st);
				
				bw.write(st + "\n");
			}
		}catch (IOException e) {
			System.out.println("Catch and handle exception: " + e);
		}
	}
}
