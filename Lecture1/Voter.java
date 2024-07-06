package com.test;

import java.util.Scanner;

class VoterDetails
{
	int a;
	Scanner sc=new Scanner(System.in);
	

public void inputDetails()
{
	System.out.println("Enter your age:");
	a=sc.nextInt();
}

public void displayData()
{
	if(a>=18){
		System.out.println("You are elegibal for vote:");
	}else {
		System.out.println("You are not elegibal for vote:");
	}
}

public class Voter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VoterDetails obj=new VoterDetails();
		obj.inputDetails();
		obj.displayData();
		

	}

}
}
