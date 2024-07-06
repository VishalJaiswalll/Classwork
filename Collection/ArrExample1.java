package com.example;

import java.util.Scanner;

public class ArrExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]=new int[5];
		int i,min;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter five Number");
		
		for(i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		min=arr[0];
		for(i=0;i<5;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("You have entered:");
		
		for(i=0;i<5;i++)
		{
			System.out.println("arr["+1+"]="+arr[i]);
		}
	}

}
