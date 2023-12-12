package edu.ncit.demo.exception.exceptionRule;

public class ExceptionHierarchy {

	public static void main(String[] args) {
		
		exampleArrayIndexOutOfBoundException();
		exampleNullPointerException();
	

	}
	
	public static void exampleNullPointerException() throws NullPointerException {
		
		String a=null;
		
		if(a.equals("abc")) {
			System.out.println("equal checking::");
		}
	}
	
	
	public static void exampleArrayIndexOutOfBoundException() throws ArrayIndexOutOfBoundsException {
		
		int [] marks= new int[2];	
		
		if(marks[2]==0) {
			System.out.println("arrays vlaue::"+ marks);
		}
		
	}

}
