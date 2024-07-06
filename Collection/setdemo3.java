package com.example;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class setdemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        HashSet<String> Fruits = new HashSet<>();
		        Fruits.add("Apple");
		        Fruits.add("Banana");
		        Fruits.add("Mango");
		        Fruits.add("Orange");
		        
		        
		        LinkedHashSet<String> Vegetables = new LinkedHashSet<>();
		        Vegetables.add("Carrot");
		        Vegetables.add("Broccoli");
		        Vegetables.add("Cauliflower");
		        Vegetables.add("Potato");

		        System.out.println("Favorite Fruits: " + Fruits);
		        Iterator<String> iterator = Fruits.iterator();
				while (iterator.hasNext()) {
				String name = iterator.next();
				System.out.println(name);
				}
		        System.out.println("Favorite Vegetables: " + Vegetables);
		        Iterator<String> iterator1 = Vegetables.iterator();
				while (iterator1.hasNext()) {
				String name = iterator1.next();
				System.out.println(name);
				}

		        // Union operation: Add all elements from favoriteVegetables to favoriteFruits
		        Fruits.addAll(Vegetables);
		        System.out.println("Union: " + Fruits);

		        // Intersection operation: Find common elements between favoriteFruits and favoriteVegetables
		        HashSet<String> intersection = new HashSet<>(Fruits);
		        intersection.retainAll(Vegetables);
		        System.out.println("Intersection: " + intersection);

		        // Difference operation: Remove all elements from favoriteVegetables from favoriteFruits
		        Fruits.removeAll(Vegetables);
		        System.out.println("Difference: " + Fruits);

		        // Check if favoriteFruits contains a specific element
		        System.out.println("Does favoriteFruits contain 'Apple'?: " + Fruits.contains("Apple"));
		    }
			}
			


