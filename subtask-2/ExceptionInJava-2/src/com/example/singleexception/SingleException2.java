package com.example.singleexception;

public class SingleException2 {

	public static void main(String[] args) {
		int limit = 10;
		int num = 10;
		
		try {
			while(limit >= 0) {
				 int result = num/limit;
				 
				 System.out.println(num + "/" + limit +": " + result);
				 
				 limit -=1;
			}
		}catch(ArithmeticException ae) {
			
			System.out.println("Exception Occured");
		}
	}

}
