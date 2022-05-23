package com.example.multipleexception;

public class MultipleException {

	public static void main(String[] args) {
		
		System.out.println("Start the program");
		
		int numArray[] = {10,20,30,40,50};
		
//		try {
//			
////			numArray[5] = 70/0;
//			
//			numArray[5] = 70/1;
//			
//		}catch(ArithmeticException e) {
//			
//			System.out.println("ArithmeticException caught");
//		}
//		
//		System.out.println("End of the program");

	
	
	
		
		
		try {
			
			numArray[4] = 70/0;
		}catch(ArithmeticException e) {
			
			System.out.println("ArithmeticException caught");
		}
	
		
		try {
			
			System.out.println(numArray[5]);
		}catch(ArrayIndexOutOfBoundsException aibe) {
			
			System.out.println("Caught ArrayIndexOutOfBoundsException");
		}
		
		System.out.println("End of programm");
	}
	
	
}
