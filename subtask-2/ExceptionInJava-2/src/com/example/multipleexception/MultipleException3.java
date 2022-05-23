package com.example.multipleexception;

public class MultipleException3 {
	
	
	public static void main(String[] args) {
		 System.out.println("Start the program");
			
			int numArray[] = {10,20,30,40,50};

	
	
//	
//	for(int i=0; i<=numArray.length; i++) {
//		
//		try {
//			   
//			System.out.println("i :" + i);
//			System.out.println("numArray[i]/ i ");
//			System.out.println(numArray[i]/i);
//			
//			
//			
//		}catch(ArithmeticException e) {
//			
//			System.out.println("ArithmeticException caught");
//		}
//	
//	    catch(ArrayIndexOutOfBoundsException aibe) {
//			
//			System.out.println("Caught ArrayIndexOutOfBoundsException");
//		}
//		
//		System.out.println("End of programm");
//	}
			
			
			
			
			
			
			
			

			for(int i=0; i<=numArray.length; i++) {
				
				try {
					   
					System.out.println("i :" + i);
					System.out.println("numArray[i]/ i ");
					System.out.println(numArray[i]/i);
					
					
					
				}catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
					
					System.out.println("Caught Exception, which one is it ? " + e.getClass());
					System.out.println(e);
				}
			
			}
	}
	}

