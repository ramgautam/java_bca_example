package edu.ncit.demo.exception.exceptionRule;

import java.io.IOException;
import java.text.ParseException;




public class ExceptionExample {

	public static void main(String[] args) {
	
		try {

			int[] myIntArray = new int[]{1, 2, 3};// 0,1,2
//
//			int number = 10 / 0;
			String name="ram";
			System.out.println(name.toUpperCase());

			//print4thItemInArray(myIntArray);
			System.out.println("number 0 index "+ myIntArray[0]);
			System.out.println("numbern 3"+ myIntArray[3]);

			//convertStringToInteger("abc");

			///

		} catch (NullPointerException e) {
			System.out.println("NullPointerException");
		}
		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("The array doesn't have four items!");
		}
		catch (ArithmeticException ex) {
			System.out.println("The ArithmeticException!");
		}
		catch (Exception ex) {
			System.out.println("The ArithmeticException!");
				
		}
		
		try {
			convertStringToInteger("abc");
			
		}catch ( Exception e ) {
			System.out.println("NumberFormatException occured");
		}
	
		
		
		
		

	}

	private static void print4thItemInArray(int[] arr) 
			throws ArrayIndexOutOfBoundsException,
	IOException {
		System.out.println(arr[3]);
	}
	
	private  static int convertStringToInteger(String a) 
			throws ParseException {
		
		return Integer.parseInt(a);
	}
	
	
}
