package com.example;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class setdemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Set<String> studlist=new LinkedHashSet<String>();
			studlist.add("divya");
			studlist.add("sanika"); 
			studlist.add("Rekha");
			studlist.add("Renukka");
			System.out.println("The student list recently added as:"+studlist);
			
			Iterator<String> iterator = studlist.iterator();
			while (iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
			}
			
			studlist.remove("Rekha");
			System.out.println("The list of elements after removal of elements: "+studlist);
			
			}
		

	}


