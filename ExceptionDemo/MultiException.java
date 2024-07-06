package com.example;

public class MultiException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		int a[]=new int[5]; //ARRAY Declaration a[0] a[1]a[2] a[3] a[4]
		int c=23/0;
		a[5]=50/5;
		System.out.println(a[5]);
		}
		catch(ArithmeticException e){
			System.out.println(e);
			
			System.out.println("you can cot divide by zero");
		}
		catch(ArrayIndexOutOfBoundsException o)
		{
			System.out.println(o);
		}
		System.out.println("No Exception found");
	}

}
