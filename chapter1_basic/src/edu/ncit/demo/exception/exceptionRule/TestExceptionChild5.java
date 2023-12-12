package edu.ncit.demo.exception.exceptionRule;

class Parent {
	void msg() throws Exception {
		System.out.println("parent");
	}
}

public class TestExceptionChild5 extends Parent {
	void msg() {
		System.out.println("child");
	}

	public static void main(String args[]) {
		Parent p = new TestExceptionChild5();
		try {
			p.msg();
		} catch (Exception e) {
		}
	}
}
