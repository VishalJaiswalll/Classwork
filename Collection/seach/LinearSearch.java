package com.example.seach;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        // Declare variables to store the length of the array, the search key, and the array itself
        int i, len, key;
        int[] array;

        // Create a new Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the length of the array
        System.out.print("Enter the length of the array: ");
        len = input.nextInt();

        // Create a new array of the specified length
        array = new int[len];

        // Prompt the user to enter the elements of the array
        System.out.println("Enter the " + len + " elements:");
        for (i = 0; i < len; i++) {
            // Read each element from the user and store it in the array
            array[i] = input.nextInt();
        }

        // Prompt the user to enter the search key
        System.out.print("Enter the search key value: ");
        key = input.nextInt();

        // Perform a linear search for the search key in the array
        for (i = 0; i < len; i++) {
            // Check if the current element matches the search key
            if (array[i] == key) {
                // If a match is found, print the location of the key and exit the loop
                System.out.println(key + " is present at location: " + (i + 1));
                break;
            }
        }

        // If the loop completes without finding a match, print a message indicating that the key is not present
        if (i == len) {
            System.out.println(key + " doesn't exist in array.");
        }
    }
}