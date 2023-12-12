package edu.ncit.demo.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class ShoppingCart_HashMap {
	
public static void main(String a[]){
    	
        Map<String, Double> groceryItems = new HashMap<String, Double>();
        
        System.out.println("\nIs HashMap empty? "+groceryItems.isEmpty());
        
        //add grocery Items to Shopping cart
        
        groceryItems.put("Tomatoes", 10.50);
        groceryItems.put("Onions", 4.50);
        groceryItems.put("Potatoes", 20.00);
        groceryItems.put("Canola Oil", 7.00);// more than 45 . you will get 10%
        
        System.out.println("\n" +groceryItems);
        
        //getting value for the given key from hashmap
        
        System.out.println("\nPrice of Potatoes: "+groceryItems.get("Potatoes"));
        System.out.println("\nIs HashMap empty? "+groceryItems.isEmpty());
        
        groceryItems.remove("Potatoes");
        
        System.out.println("\n"+groceryItems);
        System.out.println("\nSize of the HashMap: "+groceryItems.size());
        
        //Iterating hash map
        Set<String> groceryItemNames = groceryItems.keySet();
        
        double totalePrice=0.0;
        
    	for (String eachItem : groceryItemNames) {

			System.out.println("key::"+eachItem);
			
			System.out.println("Value::"+groceryItems.get(eachItem));
			totalePrice+=groceryItems.get(eachItem);
			

		}
    	
    	System.out.println("total amount needs to be"
    			+ " paid based on selection items on cart"+ totalePrice);
   
    }

}
