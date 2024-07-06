package com.test;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> users=new ArrayList<String>();
		
		users.add("Shruti");
		users.add("vicky");
		users.add("shubh");
		users.add("yash");
		
		System.out.println("users add in company are:"+users);
		
		//Traversing list through Iterator
		Iterator itr=users.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		//To  get element for specific position
		
		String str=users.get(2);
		System.out.println("The first is:"+str);
		
		//Modify the list at specific Position
		users.set(0, "yash");
		System.out.println(users);
		
		// Add list at specific position
		
	   users.add(4,"ramesh");
	   System.out.println(users);
	   
	   // Remove list at Specific position
	   users.remove(1);
	   System.out.println(users);
	
	}

}
