package com.example;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

public class ThrowException3 {

//public static void main(String[] args)  throws Exception{
//		
////		methodA();
//		
//	try {
//		methodA();
//	}catch(Exception e) {
//		System.out.println("Caught the generic exception: " + e);
//	}
//		
//	}
//
//   public static void methodA() throws Exception{
//	   methodB();
//   }
//	
//	public static void methodB() throws IOException, URISyntaxException{
//		
//		System.out.println("Enter random number:");
//		Scanner scan = new Scanner(System.in);
//		
//		int num = scan.nextInt();
//		
//		scan.close();
//		System.out.println("You input the number: "+ num);
//		
//		if(num%2 == 0) {
//			throw new IOException("Random IOException for even numbers");
//		}
//		else {
//			throw new URISyntaxException("Some_uri","Random URISyntaxEXception for add numbers");
//		}
//	}
	
	
	
	
	
	
	
	
	
public static void main(String[] args)  throws IOException{
		
		methodA();
		
	}

   public static void methodA() throws IOException{
	  try {
		  methodB();
	  }catch(URISyntaxException e) {
		  System.out.println("Caught the URISyntaxException: " + e);
	  }
   }
	
	public static void methodB() throws IOException, URISyntaxException{
		
		System.out.println("Enter random number:");
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		scan.close();
		System.out.println("You input the number: "+ num);
		
		if(num%2 == 0) {
			throw new IOException("Random IOException for even numbers");
		}
		else {
			throw new URISyntaxException("Some_uri","Random URISyntaxException for add numbers");
		}
	}
}
