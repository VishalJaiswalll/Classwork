package com.test;

import java.util.Scanner;

class EmpDetails{
			
	int id;
	String name;
	double salary;
	Scanner sc = new Scanner(System.in);
	
	public void inputData()
	{
		System.out.println("Enter your Employee_ID: ");
		id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter your name: ");
		name=sc.nextLine();
		System.out.println("Enter your salary: ");
		salary=sc.nextDouble();
	}
	
	public void displayData()
	{
		System.out.println("welcome to new job oppertunity at Tech mahindra.");
		System.out.println("Verify your details:");
		System.out.println("Your employee id:"+id);
		System.out.println("Your name is: "+name);
		System.out.println("Your salary is: "+salary);
		
	}
}
public class OOPDemo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmpDetails obj=new EmpDetails();
		obj.inputData();
		obj.displayData();

	}

}
