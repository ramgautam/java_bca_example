package edu.ncit.demo.collection.map;

import java.util.HashMap;
import java.util.Set;

public class SearchingKeys_ShoppingCart_HashMap {

		public static void main(String a[]) {

			HashMap<String, Double> groceryItems = new HashMap<String, Double>();

			// add grocery Items to Shopping cart

			groceryItems.put("Tomatoes", 10.50);
			groceryItems.put("Onions", 4.50);
			groceryItems.put("Potatoes", 20.00);
			groceryItems.put("Canola Oil", 7.00);
			groceryItems.put("Canola Oil", 8.00);
			groceryItems.put("raddish", 4.00);// 44 .. 
			System.out.println("\n" + groceryItems);
			
			//if user has selected raddish- you don't need to pay. 

			// Iterating through HashMap Items

			System.out.println("\nSearching Grocery List of Items keys or Names \n");

			if (groceryItems.containsKey("Canola Oil")) {

				System.out.println("The shoppingCart contains key Canola Oil");

			} else {

				System.out.println("The shoppingCart does not contains key Canola Oil");

			}

			if (groceryItems.containsKey("JackFruit")) {

				System.out.println("The shoppingCart contains key JackFruit");

			} else {

				System.out.println("The shoppingCart does not contains key Onions");

			}
		     //Iterating hash map
	        Set<String> groceryItemNames = groceryItems.keySet();
	        
	        double totalePrice=0.0;
	        
	    	for (String eachItem : groceryItemNames) {

				System.out.println("key::"+eachItem);
				
				System.out.println("Value::"+groceryItems.get(eachItem));
				totalePrice+=groceryItems.get(eachItem);
				

			}
	    	
	    	System.out.println("total price including raddish"+ totalePrice);
	    	
	    	if(groceryItems.containsKey("raddish")){
	    		totalePrice=totalePrice-groceryItems.get("raddish");
	    	}
	    	System.out.println("total price"+ totalePrice);

		}
	}
