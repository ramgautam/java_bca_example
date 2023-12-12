package edu.ncit.demo.exception.exceptionRule;



public class TestExceptionChild4 extends Parent {
	void msg() throws ArithmeticException {
		System.out.println("child");
	}

	public static void main(String args[]) {
		Parent p = new TestExceptionChild4();
		try {
			p.msg();
		} catch (Exception e) {
		}
	}
}