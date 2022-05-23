package com.example.multipleexception;



public class MultipleException4 {

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
//			if(i==3) {
//				Integer.parseInt("somestring");
//			}
//			
//			if(i==4) {
//				String someStr = null;
//				
//				System.out.println(someStr.toUpperCase());
//			}
//		}catch(ArithmeticException ae) {
//			
//			System.out.println("Caught ArithmeticException " + ae);
//		}
//	
//	    catch(ArrayIndexOutOfBoundsException aibe) {
//			
//			System.out.println("Caught ArrayIndexOutOfBoundsException" + aibe);
//		}
//		catch(Exception e) {
//			System.out.println("Caught Exception " + e.getClass());
//		}
//		
//	}
//	System.out.println("End of programm");
			
			
			
			
			
			
			
			
			
			
			

			for(int i=0; i<=numArray.length; i++) {
				
				try {
					   
					System.out.println("i :" + i);
					System.out.println("numArray[i]/ i ");
					System.out.println(numArray[i]/i);
					
					if(i==3) {
						Integer.parseInt("somestring");
					}
					
					if(i==4) {
						String someStr = null;
						
						System.out.println(someStr.toUpperCase());
					}
				}catch(ArithmeticException | ArrayIndexOutOfBoundsException ex) {
					
					System.out.println("Caught some specific exception, which one is it?  " + ex);
				}
				catch(Exception e) {
					System.out.println("Caught Exception " + e.getClass());
				}
				
			}
			System.out.println("End of programm");
	}
}
