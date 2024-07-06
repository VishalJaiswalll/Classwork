package com.test;

import java.util.Scanner;

class CarDetails{
	int model;
	String name;
	double budget;
	String color;
	Scanner sc=new Scanner (System.in);


	public void inputdetails() {
		System.out.println("Enter the car Model:");
		model=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the car budget:");
		budget=sc.nextDouble();
		System.out.println("Enter the car name:");
		sc.nextLine();
		System.out.println("Enter the car color:");
		sc.nextLine();
	}
	
	public void displayData()
	{
		System.out.println("Your car model:"+model);
		System.out.println("Your car budget:"+budget);
		System.out.println("Your car name:"+name);
		System.out.println("Your car color:"+color);
	}
public class OOpDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarDetails obj=new CarDetails();
		obj.inputdetails();
		obj.displayData();
	}

}
}
