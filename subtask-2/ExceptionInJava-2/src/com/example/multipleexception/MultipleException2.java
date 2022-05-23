package com.example.multipleexception;

public class MultipleException2 {

	public static void main(String[] args) {
		
        System.out.println("Start the program");
		
		int numArray[] = {10,20,30,40,50};
		
   try {
	   
			numArray[4] = 70/1;
			
			System.out.println(numArray[5]);
			
		}catch(ArithmeticException e) {
			
			System.out.println("ArithmeticException caught");
		}
	
	    catch(ArrayIndexOutOfBoundsException aibe) {
			
			System.out.println("Caught ArrayIndexOutOfBoundsException");
		}
		
		System.out.println("End of programm");
	}
	
	
}

