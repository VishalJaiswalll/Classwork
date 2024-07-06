package com.example;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int c=Integer.parseInt("2");
			System.out.println(c);
			
			int a=Integer.parseInt("sang");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("it is intresting but difficult to learn java");
		}
	}

}
