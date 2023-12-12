package edu.ncit.demo.abastract1;

public class EmployeeAbastractHandling {

	public static void main(String[] args) {
		Employee contractor = new Contractor("contractor", 10, 10);
		//Drawable d=new Circle();//In real scenario, object is provided by method e.g. getDrawable()
		//mployee employee= new Employee() ;
		Employee fullTimeEmployee = new FullTimeEmployee("full time employee", 8);

		System.out.println(contractor.calculateSalary());
		System.out.println(fullTimeEmployee.calculateSalary());

	}

	
	
}
