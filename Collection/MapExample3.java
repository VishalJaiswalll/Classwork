package com.example;

      import java.util.Map;

		import java.util.HashMap;

public class MapExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creating a map using the HashMap
		Map<String, Integer> emp= new HashMap<String,Integer>();
		// Insert elements to the map
		emp.put("Mohane1", 18771);
		emp.put("Raje2", 28766);
		emp.put("Rohan23", 45008);
		System.out.println("Map: " + emp);
		// Access keys of the map
		System.out.println("Keys: " + emp.keySet());
		// Access values of the map
		System.out.println("values: " + emp.values());
		// Access entries of the map
		System.out.println("Entries: " + emp.entrySet());
		// Remove Elements from the map
		int value = emp.remove("Raje2");
		System.out.println("Removed Value: " + value);


	}

}
