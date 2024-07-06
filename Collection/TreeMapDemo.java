package com.example;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Map<String, Integer> treeMap = new TreeMap<>();
		
		// Adding elements to the tree map
		treeMap.put("B",7);
		treeMap.put("D",4);
		treeMap.put("E", 1);
		treeMap.put("C", 3);
		treeMap.put("A", 2);
		System.out.println(treeMap);
		
		// Getting values from the tree map
		int valueA = treeMap.get("A");
		System.out.println("value of A: " + valueA);
		
		// Removing elements from the tree map
		treeMap.remove("B");
		
		// Iterating over the elements of the tree map
		for (String key : treeMap.keySet()) {
		System.out.println("Key: " + key + ", Value: " + treeMap.get(key));

		}

		
	}

}
