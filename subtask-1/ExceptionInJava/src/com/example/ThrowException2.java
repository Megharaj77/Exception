package com.example;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

public class ThrowException2 {

//	public static void main(String[] args) {
//		
//		checkAgeForExamEligibility();
//	}
//	
//	 private static void checkAgeForExamEligibility() {
//			
//		 try {
//			 
//			 System.out.println("Enter your age to check for exam eligibility");
//				
//				Scanner scan = new Scanner(System.in);
//				
//				int age = scan.nextInt();
//				
//				scan.close();
//				
//				if(age < 21 || age > 35) {				
//					
//					throw new Exception("Sorry you are not eligible for this exam");
//				}
//					System.out.println("You are eligible for this exam");
//				
//		 }catch(Exception e) {
//			 System.out.println("Catch and handle exception: " + e);
//		 }
//		 }
	
	
	
	
	
//public static void main(String[] args) throws Exception{
//		
//		checkAgeForExamEligibility();
//	}
//	
//		 private static void checkAgeForExamEligibility() throws Exception{
//				System.out.println("Enter your age to check for exam eligibility");
//				
//				Scanner scan = new Scanner(System.in);
//				
//				int age = scan.nextInt();
//				
//				scan.close();
//				
//				if(age < 21 || age > 35) {					
//					
//					throw new Exception("Sorr you are not eligible for this exam");
//				}
//				else {
//					System.out.println("You are eligible for this exam");
//				}
//			}
	
	
	
	
	public static void main(String[] args)  throws Exception{
		
		methodWhichThrowsMultipleException();
		
//		try {
//			methodWhichThrowsMultipleException();
//		}catch(IOException | URISyntaxException e) {
//			System.out.println("Catch and handle exception: " + e);
//		}
		
	}
	
	public static void methodWhichThrowsMultipleException() throws IOException, URISyntaxException{
		
		System.out.println("Enter random number:");
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		scan.close();
		System.out.println("You input the number: "+ num);
		
		if(num%2 == 0) {
			throw new IOException("Random IOException for even numbers");
		}
		else {
			throw new URISyntaxException("Some_uri","Random URIEXception for add numbers");
		}
	}
		
}

