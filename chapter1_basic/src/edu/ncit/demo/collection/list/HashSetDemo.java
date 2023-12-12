package edu.ncit.demo.collection.list;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		Set<String> setValues= new HashSet<String>();
		
		setValues.add("Micheal");
		
		setValues.add("Smith");
		
		setValues.add("Smith");
		
		System.out.println(setValues);
		
		//using for each
		
		for(String name: setValues) {
			
			System.out.println("for each::"+name);
		}

	}

}
