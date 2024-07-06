package com.example.seach;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int[] array;
	        int target;
	        int result;

	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter the size of the array:");
	        int size = scanner.nextInt();

	        array = new int[size];

	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < size; i++) {
	            array[i] = scanner.nextInt();
	        }

	        // Sort the array
	        Arrays.sort(array);

	        System.out.println("Enter the target element to search:");
	        target = scanner.nextInt();

	        result = binarySearch(array, target);

	        if (result == -1) {
	            System.out.println("Element not found in the array");
	        } else {
	            System.out.println("Element found at index " + result);
	        }
	    }

	    public static int binarySearch(int[] array, int target) {
	        int left = 0;  //set first to first index
	        int right = array.length - 1;   //set last to last elements in array

	        while (left <= right) {          //calculate mid of the array
	            int mid = left + (right - left) / 2;

	            if (array[mid] == target) {  
	                return mid;
	            } else if (array[mid] < target) { 
	                left = mid + 1;  
	            } else {
	                right = mid - 1;   //the key is to be searched in the second half of the array
	            }
	        }

	        return -1;
	    }
	}