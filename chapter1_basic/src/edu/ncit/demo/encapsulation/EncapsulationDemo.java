package edu.ncit.demo.encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) {
		EmployeeDemoWIthEncapsulation obj = new EmployeeDemoWIthEncapsulation();
	         obj.setEmpName("Mario");
	         obj.setEmpAge(32);
	         obj.setEmpSSN(112233);
	         System.out.println("Employee Name: " + obj.getEmpName());
	         System.out.println("Employee SSN: " + obj.getEmpSSN());
	         System.out.println("Employee Age: " + obj.getEmpAge());

	}

}
