package com.example;
import java.util.ArrayList;
		import java.util.HashMap;
		import java.util.Map;
		import java.util.Scanner;
		public class ShoppingCartSystem {
		// TODO Auto-generated method stub
		    public static void main(String[] args) {
		        // Sample products in the store
		        Map<Integer, String> products = new HashMap<>();
		        Map<Integer, Double> prices = new HashMap<>();
		        products.put(1, "Apple");
		        prices.put(1, 1.0);
		        products.put(2, "Banana");
		        prices.put(2, 0.5);
		        products.put(3, "Orange");
		        prices.put(3, 0.75);
		        products.put(4, "Grapes");
		        prices.put(4, 2.0);

		        // Cart to hold product ids
		        ArrayList<Integer> cart = new ArrayList<>();
		        int choice;

		        Scanner sc = new Scanner(System.in);
		        System.out.println("Welcome to the Shopping Cart System!");

		        while (true) {
		        	System.out.println("Select the operation:");
		            System.out.println("1. Display Products\n2. Add Product to Cart\n3. Remove Product from Cart\n4. Checkout\n5. Exit");
		            System.out.println("Enter your choice:");
		            choice = sc.nextInt();

		            switch (choice) {
		                case 1:
		                    System.out.println("Available products:");
		                    for (Map.Entry<Integer, String> product : products.entrySet()) {
		                        System.out.println(product.getKey() + ". " + product.getValue() + " - $" + prices.get(product.getKey()));
		                    }
		                    break;

		                case 2:
		                    System.out.println("Enter the product ID to add to cart:");
		                    int productId = sc.nextInt();
		                    if (products.containsKey(productId)) {
		                        cart.add(productId);
		                        System.out.println(products.get(productId) + " added to cart.");
		                    } else {
		                        System.out.println("Invalid product ID. Please try again.");
		                    }
		                    break;

		                case 3:
		                    System.out.println("Enter the product ID to remove from cart:");
		                    productId = sc.nextInt();
		                    if (cart.remove((Integer) productId)) {
		                        System.out.println(products.get(productId) + " removed from cart.");
		                    } else {
		                        System.out.println("Product not found in cart. Please try again.");
		                    }
		                    break;

		                case 4:
		                    double total = 0.0;
		                    System.out.println("Items in your cart:");
		                    for (int id : cart) {
		                        System.out.println(products.get(id) + " - $" + prices.get(id));
		                        total += prices.get(id);
		                    }
		                    System.out.println("Total price: $" + total);
		                    cart.clear();  // Empty the cart after checkout
		                    System.out.println("Thank you for shopping with us!");
		                    break;

		                case 5:
		                    System.out.println("Thank you for using the Shopping Cart System. Goodbye!");
		                    sc.close();
		                    System.exit(0);

		                default:
		                    System.out.println("Please choose properly!!!");
		                    break;
		            }
		        }
		    }
		
	
	}


