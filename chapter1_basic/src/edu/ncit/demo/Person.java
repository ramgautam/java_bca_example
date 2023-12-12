package edu.ncit.demo;

public class Person {
	  
	// state of an object, member variable, instance variable, attributes
	  int age;
	  String name;
	  
	  // behavior of an object
	  public void set_value() {
	    age = 20;
	    name = "Robin";
	  }
	  
	  public void get_value() {
	    System.out.println("Age is " + age);
	    System.out.println("Name is " + name);
	  }
	  
	  // main method
	  public static void main(String [] args) {
	    // creates a new Person object
	    Person p;// declaration
	    p= 	new Person(); // initialization
	    // changes state through behavior
	    p.set_value();// assignment
	    
	  }
	}

