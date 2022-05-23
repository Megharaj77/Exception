package com.example;

import java.util.Scanner;

public class BalanceCheck {
    private static int accountBalance = 1000;
    
	public static void main(String[] args) throws InsufficientBalanceException {
		
		try {
			System.out.println("Enter the amount to withdraw:");
			
			Scanner scan = new Scanner(System.in);
			
			int withdrawAmt = scan.nextInt();
			
			scan.close();
			
			if(withdrawAmt > accountBalance) {
//				System.out.println("Insufficient balance:");
				
				throw new InsufficientBalanceException("Insufficient balance");
			}
			
				System.out.println("Withdraw successfull");
			
		}catch(InsufficientBalanceException e) {
			
			System.out.println("Catch and handle exception: " + e);
		}
		}
}
