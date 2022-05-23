package com.example.singleexception;

public class SingleException {

	public static void main(String[] args) {
		
		int num1 = 1;
//		
//		try {
			
//			
//			System.out.println("Start of the program");
//			System.out.println("num1/0 : " + (num1/0));
//			System.out.println("Unexecuted code just occured after exception");
//		}catch(Exception e){
//			
////			System.out.println("we'll never get here if there is no exception");
//			
////			System.out.println(e);
//			
////			e.printStackTrace();
//			
//			
//			
//			System.out.println("Exception class: "+ e.getClass());
//			System.out.println("Airthmatic exception is type of exception: " + (e instanceof Exception));
//		}
//		System.out.println("End the program");
//	}

	
	
	
//	
//	try {
		
//		
//		System.out.println("Start of the program");
//		System.out.println("num1/0 : " + (num1/0));
//		System.out.println("Unexecuted code just occured after exception");
//	}catch(ArithmeticException ae){
//		
//     System.out.println(ae);
//     ae.printStackTrace();
//     
//	}
//	System.out.println("End the program");
		
		
		
		
		
		

		try {
			
			
			System.out.println("Start of the program");
			System.out.println("num1/0 : " + (num1/0));
			System.out.println("Unexecuted code just occured after exception");
		}catch(ArithmeticException ae){
			
	     System.out.println("First Exception caught here - what about second: ");
	     
	     System.out.println("num1/0 : " + (num1/0));
	     
		}
		System.out.println("End the program");
		
}

}
