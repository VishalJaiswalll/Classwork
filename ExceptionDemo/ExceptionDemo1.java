package com.example;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
		int a[]=new int[5];
		a[5]=50/5;
		int c=23/0;
		
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
	    }

}
