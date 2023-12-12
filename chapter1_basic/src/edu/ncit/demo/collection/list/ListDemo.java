package edu.ncit.demo.collection.list;

import edu.ncit.demo.collection.Bicycle;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	
	public static void main(String[] args)
	
	{ 
        // Creating and initialization a list 
        List<Integer> integerList1 = new ArrayList<Integer>();
        List<Bicycle> bicycleList= new ArrayList<Bicycle>();
    	
       
        // Adds 1 at 0 index 
        integerList1.add(0, 1); 
  
        // Adds 2 at 1 index 
        integerList1.add(1, 2);
       
        System.out.println("list with sout"+integerList1); 
        
        // for each
        for(Integer firstNumber : integerList1) {
        	System.out.println("1st list integer"+firstNumber);
        }
  
        // Creating another list 
        List<Integer> integerList2= new ArrayList<Integer>(); 
  
        integerList2.add(1);//0 
        integerList2.add(2);//1 
        integerList2.add(3);//2 
        
        
        for(int index=0;index<integerList2.size(); index++ ) {
        	System.out.println("2nd list "+"index "+ index 
        			+"::value" +integerList2.get(index));
        }
  
//        // Will add list l2 from 1 index 
//        integerList1.addAll(1, integerList2); 
//        System.out.println(integerList1); 
//  
//        // Removes element from index 1 
//        integerList1.remove(1); 
//        System.out.println(integerList1); 
//  
//        // Prints element at index 3 
//        System.out.println(integerList1.get(3)); 
//  
//        // Replace 0th element with 5 
//        integerList1.set(0, 5); 
//        System.out.println(integerList1); 
    }

}
