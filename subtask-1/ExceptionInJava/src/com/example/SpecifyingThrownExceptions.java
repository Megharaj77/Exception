package com.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class SpecifyingThrownExceptions {

//	public static void main(String[] args) throws IOException {
//		
//		File file = new File("somefile.txtx");
//		
//		BufferedReader br = new BufferedReader(new FileReader(file));
//		
//		String st = br.readLine();
//		
//		while(st != null) {
//			System.out.println(st);
//			
//			st =br.readLine();
//		}
//		
//		br.close();
//		}
	
	
	
	
	
//	public static void main(String[] args)  {
//		
//		try {
//			readFile();
//		} catch (IOException e) {
//			System.out.println("Catch the exception in order to handle it: " + e);
//			
//		}
//	}
//	
//	
//	   public static void readFile() throws IOException {
//		
//        File file = new File("somefile.txtx");
//		
//		BufferedReader br = new BufferedReader(new FileReader(file));
//		
//		String st = br.readLine();
//		
//		while(st != null) {
//			System.out.println(st);
//			
//			st =br.readLine();
//		}
//		
//		br.close();
//	}
	
	
	
	
	
	
	
	
	
//public static void main(String[] args) {
//		
//	      readFileA();
//	}
//	 
//      public static void readFileA() {
//    	  try {
//			readFileB();
//		} catch (IOException e) {
//			System.out.println("Catch and handle exception: " + e);
//		}
//      }
//	
//	   public static void readFileB() throws IOException {
//		
//        File file = new File("somefile.txtx");
//		
//		BufferedReader br = new BufferedReader(new FileReader(file));
//		
//		String st = br.readLine();
//		
//		while(st != null) {
//			System.out.println(st);
//			
//			st =br.readLine();
//		}
//		
//		br.close();
//	}
	   
	   
	   
	   
	   
	   
	   public static void main(String[] args) {
			
		      readFileA();
		}
		 
	      public static void readFileA() {
	    	  readFileB();
	      }
		
		   public static void readFileB() {
			
	       try {
	    	   File file = new File("somefile.txtx");
				
				BufferedReader br = new BufferedReader(new FileReader(file));
				
				String st = br.readLine();
				
				while(st != null) {
					System.out.println(st);
					
					st =br.readLine();
				}
				
				br.close();
	       }catch(IOException e){
	    	   
	    	   System.out.println("Catch and handle exception: " + e);
	       }
		}
}
