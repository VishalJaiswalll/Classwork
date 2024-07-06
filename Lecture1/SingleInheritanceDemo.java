package com.test;

import java.util.Scanner;

class SingleInheri
{
	int a,b;
	Scanner sc=new Scanner(System.in);
	public void input()
	{
		System.out.println("Enter two number:");
		a=sc.nextInt();
		b=sc.nextInt();
	}
	
}
class Derived extends SingleInheri
{
	int c;
	public void output()
	{
		c=a+b;
		System.out.println("The addition of two number is:"+c);
	}
}





public class SingleInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Derived obj=new Derived();
		obj.input();
		obj.output();
	}

}
