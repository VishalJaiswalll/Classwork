package com.example;

import java.util.Scanner;

public class BankingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		double balance =0.0;
		
		while(true)
			//Display the Menu
		{
			System.out.println("Welcome to simple bank!!");
			System.out.println("1.Check Balance");
			System.out.println("2.Deposit money");
			System.out.println("3.Withdraw Money");
			System.out.println("4.Exit");
			System.out.println("Enter your choice: ");
			
		    // Get user input
		      int choice = scanner.nextInt();

		      // Process the choice
		      if (choice == 1) {
		        // Check Balance
		        System.out.println("Your current balance is: $" + balance);
		      } else if (choice == 2) {
		        // Deposit Money
		        System.out.print("Enter amount to deposit: ");
		        double amount = scanner.nextDouble();
		        if (amount > 0) {
		          balance += amount;
		          System.out.println("Deposit successful! Your new balance is: $" + balance);
		        } else {
		          System.out.println("Invalid deposit amount. Please try again.");
		        }
		      } else if (choice == 3) {
		        // Withdraw Money
		        System.out.print("Enter amount to withdraw: ");
		        double amount = scanner.nextDouble();
		        if (amount > 0 && amount <= balance) {
		          balance -= amount;
		          System.out.println("Withdrawal successful! Your new balance is: $" + balance);
		        } else {
		          System.out.println("Invalid withdrawal amount or insufficient funds. Please try again.");
		        }
		      } else if (choice == 4) {
		        // Exit
		        System.out.println("Thank you for using Simple Bank! Visit Again!");
		        break;
		      } else {
		        // Invalid choice
		        System.out.println("Invalid choice. Please try again.");
		      }
		    }

		    scanner.close();
		  }
		}