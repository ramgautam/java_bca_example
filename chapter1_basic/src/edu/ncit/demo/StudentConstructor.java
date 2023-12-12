package edu.ncit.demo;

public class StudentConstructor {
	
	//data member// instance variable
	 int rollNumber=0;
	 String name;
	 String address;
	 String course;
	 String level;

	//Default constructor
	public StudentConstructor() {
		rollNumber=0;
		name="";
		address="USA";
		course="";
		level="Bachelor";
		
	}
	
	//parameterized constructor
	public StudentConstructor(int id ) {
		System.out.println("one parameterized constructor:"+ id);
		
	}
	//- constructor will be called during object creation time.
	
	
	//parameterized constructor
	public StudentConstructor
	(int id, String studentName, String studentAddress, 
			String studentCourse, String sLevel) {
		rollNumber=id;
		name=studentName;
		address=studentAddress;
		course=studentCourse;
		level=sLevel;
		System.out.println("from constructor");
		displayStudentName();
		
	}
	
	private void displayStudentName(){
		System.out.println("Student Name:: "+ name);
	}


	
}
