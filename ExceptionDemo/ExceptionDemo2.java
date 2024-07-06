package com.example;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
		int a[]=new int[5];
		a[4]=65/5;
		
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("You can not divide by Zero");
		}
		catch(ArrayIndexOutOfBoundsException o)
		{
			System.out.println(o);
		}
		System.out.println("no exception found");
	    }

}
