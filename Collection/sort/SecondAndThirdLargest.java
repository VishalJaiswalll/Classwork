package com.example.sort;

import java.util.Scanner;

public class SecondAndThirdLargest {
	
	public static void main(String[] args) {
		
		int i,j,temp; 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of element: ");
		int n=sc.nextInt();
		int[] a=new int[n];
		
	    System.out.println("Enter the elements:");   
		for(i=0;i<n;i++) 
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		System.out.println("The sorted elements are:");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		int secondLargest = a[n - 2];
        int thirdLargest = a[n - 3];

        System.out.println("Second largest element: " + secondLargest);
        System.out.println("third largest element: " + thirdLargest);
		
	}
}
