package com.skillsoft.ioexception;


public class Finally2 {

	public static void main(String[] args) {
		
//		String s[] = {"Gavin","Kristen","Rebecca"};
//		
//		try {
//			
//			for(int i = 0; i<=3; i++) {
//				
//				System.out.println(s[i] + ": " + s[i].length());
//			}
//		}catch(ArrayIndexOutOfBoundsException ae) {
//			
//			System.out.println("Caught ArrayIndexOutOfBoundsException");
//		}
//		finally {
//			
//			System.out.println("In the finally block");
//			System.out.println("This code will always executed");
//		}
//		
//		System.out.println("End of program");
//	}
	
	
	
	
	
	
	String s[] = {"Gavin","Kristen","Rebecca"};
	
	try {
		
		for(int i = 0; i<=3; i++) {
			
			System.out.println(s[i] + ": " + s[i].length());
		}
	}
		finally {
	
		
		System.out.println("In the finally block");
		System.out.println("This code will always executed");
	}
	
	System.out.println("End of program");
}
}
