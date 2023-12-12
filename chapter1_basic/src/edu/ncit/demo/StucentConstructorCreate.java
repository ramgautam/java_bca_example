package edu.ncit.demo;

public class StucentConstructorCreate {

	public static void main(String[] args) {

		//// creating object, initializing object using Default constructor
		StudentConstructor student1 = new StudentConstructor();

		student1.rollNumber = 1;
		student1.name = "Micheal";
		student1.course = "Bachelor in Information Technology";
		student1.level = "Bachelor";

		// creating object, initializing object using Prameterized constructor
		
		StudentConstructor student3 = new StudentConstructor(3);
		
		
		StudentConstructor student2 = new StudentConstructor
				(2, "Jordan", "France", "Bachelor in Computer Sceience",
				"Bachelor");

		//student1.displayStudentName();

		//student2.displayStudentName();
		
		

	}

}
