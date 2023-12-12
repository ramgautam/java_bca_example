package edu.ncit.demo.accessmodifier;

public class ProtecetedClass {
	
	protected int addTwoNumbers(int a, int b){
	    	int sum=a+b;
	    	System.out.println("sum in same package method callingh"+sum);
		return sum;
	}
}
