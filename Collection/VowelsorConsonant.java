package com.example;
	import java.util.Scanner;
public class VowelsorConsonant {
		
		    public static void checkVowelOrConsonant(Scanner scanner) {
		        System.out.print("Enter a letter: ");
		        char letter = scanner.next().toLowerCase().charAt(0);

		        // Check if the input is a valid alphabet character
		        if (letter < 'a' || letter >'z') {
		            System.out.println("Invalid input! Please enter an alphabet letter.");
		            return;
		        }

		        switch (letter) {
		            case 'a':
		            case 'e':
		            case 'i':
		            case 'o':
		            case 'u':
		                System.out.println(letter + " is a vowel.");
		                break;
		            default:
		                System.out.println(letter + " is a consonant.");
		                break;
		        }
		    }

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        boolean exit = false;

		        while (!exit) {
		            System.out.println("\nMenu:");
		            System.out.println("1. Check if a letter is a vowel or consonant");
		            System.out.println("2. Exit");
		            System.out.print("Enter your choice: ");
		            int choice = scanner.nextInt();

		            switch (choice) {
		                case 1:
		                    checkVowelOrConsonant(scanner);
		                    break;
		                case 2:
		                    exit = true;
		                    System.out.println("Exiting program.");
		                    break;
		                default:
		                    System.out.println("Invalid choice! Please try again.");
		                    break;
		            }
		        }

		        scanner.close();
		    }
		

		
	}

