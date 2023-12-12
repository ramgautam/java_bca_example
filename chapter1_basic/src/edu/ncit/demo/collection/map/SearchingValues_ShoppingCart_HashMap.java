package edu.ncit.demo.collection.map;

import java.util.HashMap;

public class SearchingValues_ShoppingCart_HashMap {

	public static void main(String a[]) {

		HashMap<String, Double> groceryItems = new HashMap<String, Double>();

		// add grocery Items to Shopping cart

		groceryItems.put("Tomatoes", 10.50);
		groceryItems.put("Onions", 4.50);
		groceryItems.put("Potatoes", 20.00);
		groceryItems.put("Canola Oil", 7.00);
		System.out.println("\n" + groceryItems);

		// searching Items Price using containsValue

		System.out.println("\nSearching Grocery List of Items keys or Names \n");

		if (groceryItems.containsValue(7.00)) {

			System.out.println("The shoppingCart contains Canola Oil of Value is 7.00");

		} else {

			System.out.println("The shoppingCart does not contains value of Canola Oil");

		}

		if (groceryItems.containsValue(4.50)) {

			System.out.println("The shoppingCart contains value of Onions is 4.50");

		} else {

			System.out.println("The shoppingCart does not contains value of Onions");

		}

	}
}
