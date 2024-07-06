package com.example;

import java.util.Scanner;

public class AscendingSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]=new int[5];
		int i,j, temp;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter five numbers:"); //67 54 34 43 87 arr[@] arr[1] arr[2] arr[3] arr[4]
		//sorting using bubble sort 54 67 34 43 87 34 67 54 43 87
		for(i=0;i<5;i++)
		{
		    arr[i]=sc.nextInt();
		}
		for (i = 0; i <5; i++) { 
		  for (j=i+1; j<5;j++) {
		     if(arr[i] > arr[j]) {
		         temp = arr[i];
		          arr[i] = arr[j];
	           	  arr[j] = temp;
		      }
		  }
		
		}
		
		for(i=0;i<5;i++)
		{
		System.out.println(arr[i]);
		}
		
	}

}
