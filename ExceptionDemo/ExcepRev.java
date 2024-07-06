package com.example;

public class ExcepRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=10,b=0,c;
			c=a/b;
		}
		catch(Exception e){
			System.out.println(e);
			System.out.println("You cannot divide by Zero");
		}
		finally {
			System.out.println("One Should know exception for smooth execution");
		}
	}

}
