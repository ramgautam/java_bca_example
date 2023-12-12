package edu.ncit.demo;

public class StudentClassObjectUsingNew {
	
	// creating main method inside the Student class
	public static void main(String args[]) {
		// Creating an object or instance of Student class
		Student s1 = new Student();// creating an object of Student - creation/ declaration and initialization
		// Printing values of the object
		
		//1 type using reference variable
		s1.name="Micheal";// assigning to member varaible of object using reference variable.
	
		
		//2 type - through method
		Student s2=new Student();
		s2.insertRecord(2, "Jordan");// method used to initialize the object with data members
		s2.displayInformation();
		System.out.println("object s2::"+ s2);
	}

}


