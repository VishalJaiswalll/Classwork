package com.example;

import java.util.Scanner;

public class LoanEligibility {
		
	 public static void main(String[] args) {
	        try (Scanner scanner = new Scanner(System.in)) {
				System.out.println("Enter your nationality (Indian/Non-Indian): ");
				String nationality = scanner.next();

				System.out.println("Enter your salary: ");
				double salary = scanner.nextDouble();

				if (nationality.equalsIgnoreCase("Indian") && salary > 50000) {
				    System.out.println("You are eligible for the loan.");
				} else {
				    throw new ArithmeticException("You are not eligible for the loan.");
				}
			}
	    }
	}