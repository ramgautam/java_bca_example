package edu.ncit.demo;

//Java Program to illustrate how to define a class and fields  
//Defining a Student class.  
public class Student  {
//defining fields  
	 private int id=1;// field or data member or instance variable- 0;
	String name="abc";
	
	public void insertRecord(int rollNumber, String studentName) {
		
		id=rollNumber;
		name=studentName;
		
	
	}
	public void displayInformation() {
		System.out.println("Rolll Number:"+id+"  Name : "+ name);
		
			
	}

}
