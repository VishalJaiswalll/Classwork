package com.example;

import java.util.Scanner;

public class SwitchDemoCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,ans,choice;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("welcome to online calculator!!!");
		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		System.out.println("Enter your choise:");
		choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.println("Enter the first numbers:");
			a=sc.nextInt();
			System.out.println("Enter the second numbers:");
			b=sc.nextInt();
			ans=a+b;
			System.out.println("The Addition is:"+ans);
			break;
			
		case 2:
			System.out.println("Enter the first numbers:");
			a=sc.nextInt();
			System.out.println("Enter the second numbers:");
			b=sc.nextInt();
			ans=a-b;
			System.out.println("The Substraction is:"+ans);
			break;
			
		case 3:
			System.out.println("Enter the first numbers:");
			a=sc.nextInt();
			System.out.println("Enter the second numbers:");
			b=sc.nextInt();
			ans=a*b;
			System.out.println("The Multiplication is:"+ans);
			break;
			
		case 4:
			System.out.println("Enter the first numbers:");
			a=sc.nextInt();
			System.out.println("Enter the second numbers:");
			b=sc.nextInt();
			ans=a/b;
			System.out.println("The Division is:"+ans);
			break;
			
		default:
		
		   System.out.println("Please choose properly!!!");
		break;
		
		
			
			
		}

	}

}