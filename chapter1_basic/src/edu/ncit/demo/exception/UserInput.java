package edu.ncit.demo.exception;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {

		Scanner myObj = new Scanner(System.in); // Create a Scanner object
	
		int firstNumber = 0;
		int secondNumber=0;

		int value =0;
		
		while(value==0) {
		try {

			System.out.println("Enter firstNumber");
			firstNumber = myObj.nextInt();// 
			
			System.out.println("Endter second Number");
			secondNumber = myObj.nextInt();
			value=1;
		} catch (Exception e) {
			System.out.println("you have not given correct vlaue for first number");
			
		}
		
		}
		
	//now acutal operation
		int sum=firstNumber+secondNumber;
		System.out.println("Sum"+sum);

	}

}
