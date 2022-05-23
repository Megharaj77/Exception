package com.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class TryWithResources {

//	public static void main(String[] args) {
//		BufferedReader br = null;
//		
//		try {
//			File file = new File("C:\\Users\\252008\\Documents\\workspace-spring-tool-suite-4-4.14.0.RELEASE\\exceptions\\myfile.txt");
//			
//			br = new BufferedReader(new FileReader(file));
//			
//			String st = br.readLine();
//			
//			while(st != null) {
//				System.out.println(st);
//				
//				st = br.readLine();
//			}
//		}catch(IOException ex) {
//			System.out.println("Exception caught" + ex);
//		}finally {
//			if(br != null) {
//				try {
//					br.close();
//					
//				}catch(IOException e) {
//					e.printStackTrace();
//					
//				}
//				
//				System.out.println("Close the buffered reader in the finally block");
//			}else {
//				System.out.println("The buffered reader was never opened");
//			}
//		}
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			File fileIn = new File("C:\\Users\\252008\\Documents\\workspace-spring-tool-suite-4-4.14.0.RELEASE\\exceptions\\myfile.txt");
			File fileOut = new File("C:\\Users\\252008\\Documents\\workspace-spring-tool-suite-4-4.14.0.RELEASE\\exceptions\\newfile.txt");
			
			br = new BufferedReader(new FileReader(fileIn));
			bw = new BufferedWriter(new FileWriter(fileOut));
			
			bw.write("This is a copy!\n");
			
			String st = null;
			
			while((st =br.readLine()) != null) {
				System.out.println(st);
				
				bw.write(st + "\n");
			}
		}
			finally {
				br.close();
				bw.close();
			}
			
	}
}
