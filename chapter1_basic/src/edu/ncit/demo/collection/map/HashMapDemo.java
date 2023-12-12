package edu.ncit.demo.collection.map;

import java.util.HashMap;
import java.util.Map;

class HashMapDemo { 
    public static void main(String args[]) 
    { 
        Map<String, Integer> hm = new HashMap<String, Integer>(); 
  
        hm.put("a", new Integer(100)); 
        hm.put("b", new Integer(200)); 
        hm.put("c", new Integer(300)); 
        hm.put("d", new Integer(400));
        
        
  
        // Traversing through the map 
        //for each loop
        for (Map.Entry<String, Integer> map : hm.entrySet()) { 
            System.out.print(map.getKey() + ":"); 
            System.out.println(map.getValue()); 
            
          System.out.println("getting value using key::"+
          hm.get(map.getKey()));
        } 
    } 
} 
