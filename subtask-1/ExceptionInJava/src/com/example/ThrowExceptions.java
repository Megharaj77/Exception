package com.example;

import java.util.Scanner;

public class ThrowExceptions {

//	public static void main(String[] args) {
//		
//		System.out.println("Enter your age to check for exam eligibility");
//		
//		Scanner scan = new Scanner(System.in);
//		
//		int age = scan.nextInt();
//		
//		scan.close();
//		
//		if(age < 21 || age > 35) {
////			System.out.println("Sorry you are not eligible for this exam");
//			
//			throw new IllegalArgumentException("Sorr you are not eligible for this exam");
//		}
//		else {
//			System.out.println("You are eligible for this exam");
//		}
//	}

	
	
	
	
	
	
	
	
    public static void main(String[] args) {
		checkAgeForExamEligibility();
		
	 }

 private static void checkAgeForExamEligibility() {
	System.out.println("Enter your age to check for exam eligibility");
	
	Scanner scan = new Scanner(System.in);
	
	int age = scan.nextInt();
	
	scan.close();
	
	if(age < 21 || age > 35) {
//		System.out.println("Sorry you are not eligible for this exam");
		
//		throw new IllegalArgumentException("Sorr you are not eligible for this exam");
		
//		throw new NullPointerException("Sorr you are not eligible for this exam");
		
		throw new RuntimeException("Sorr you are not eligible for this exam");
	}
	else {
		System.out.println("You are eligible for this exam");
	}
}
}
 