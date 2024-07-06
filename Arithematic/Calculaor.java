package com.example;

import java.util.Scanner;

public class Calculaor {

	public static void main(String[] args) {

		int operator, num1, num2,Result=0;
		System.out.println("Select an operation:");
		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		
		System.out.print("Enter your operation: ");
		
		Scanner sc = new Scanner(System.in);
		operator = sc.nextInt();
		
		System.out.println("Enter your first number:");
		num1 = sc.nextInt();
		System.out.println("Enter your second number:");
		num2 = sc.nextInt();
		
		
		
		switch(operator) {
		case 1:
            System.out.println("Result: " + (num1+num2));
            break;
        case 2:
            System.out.println("Result: " + (num1- num2));
            break;
        case 3:
            System.out.println("Result: " + (num1* num2));
            break;
        case 4:
            System.out.println("Result: " + (num1 / num2));
            break;
        default:
            System.out.println("Invalid choice. Please try again.");
			
		}
	}

}
