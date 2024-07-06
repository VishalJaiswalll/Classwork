package com.example;

import java.util.Scanner;

public class CustomEx2 {
	
	int age;
	String name;
	Scanner sc=new Scanner(System.in);
	public void accept()
	{
		System.out.println("Enter youe name:");
		name=sc.nextLine();
		System.out.println("Enter your age");
		age=sc.nextInt();
	}
	public void validate()
	{
		if(age>=3)
		{
			System.out.println("You Have  grownup to take education.");
		}
		else
		{
			throw new ArithmeticException("You are Lucky!!! Enjoy your childhood!!!");
			
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomEx2 obj=new CustomEx2();
		obj.accept();
		obj.validate();
	}

}
