package edu.ncit.demo.accessmodifier;

public class DefaultPackage {
	
	 /* Since we didn't mention any access modifier here, it would
	    * be considered as default.
	    */
	    int addTwoNumbers(int a, int b){
	    	int sum=a+b;
	    	System.out.println("sum in same package method callingh"+sum);
		return sum;
		
	   }

}


