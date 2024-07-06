package com.example;

import java.util.Map;
import java.util.TreeMap;

public class FruitCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<String,Integer> fruits=new TreeMap<>();
		
		fruits.put("Apple",200);
		fruits.put("Mango",150);
		fruits.put("Banana",50);
		fruits.put("Cherry",500);
		System.out.println(fruits);
		
		Map<String,Integer> morefruits=new TreeMap<>();
		
		morefruits.put("Strawberry",400);
		morefruits.put("Jackfruit",200);
		morefruits.put("Lichi",200);
		
		fruits.putAll(morefruits);
		
		System.out.println(fruits);
		
		//get the element
		
		System.out.println("The Value of searched key is:"+fruits.get("Mango"));
		
		fruits.remove("Cherry");
		System.out.println("List after removing Cherry");
		System.out.println(fruits);
		
		fruits.clear();
		System.out.println(fruits);
		
		System.out.println(fruits.isEmpty());
		
		fruits.put("Chickoo", 50);
		System.out.println(fruits.isEmpty());
		
	}

}
