package edu.ncit.demo.exception;

public class MultipleCatch {

	public static void main(String args[]) {
		try {
			int a[] = new int[7];// 
			a[0]= 30 / 10;
			System.out.println("First print statement in try block");
			//System.exit(0);// 
		} catch (ArithmeticException e) {
			System.out.println("Warning: ArithmeticException");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Warning: ArrayIndexOutOfBoundsException");
		} catch (Exception e) {
			System.out.println("Warning: Some Other exception");
		}
		finally 
		{
			
			System.out.println("from finally- this block of code execute either exception occured or not");
			
			// this block is useful when you need to handle crucial resource properly. 
			//
			
			
		}
		System.out.println("Out of try-catch block...");
	}

}
