package edu.ncit.demo.accessmodifier;

public class DefaultWithSamePackage {

	public static void main(String args[]) {
		DefaultPackage obj = new DefaultPackage();
		/*
		 * It will throw error because we are trying to access the default method in
		 * another package
		 */
		obj.addTwoNumbers(10, 21);
	}

}
