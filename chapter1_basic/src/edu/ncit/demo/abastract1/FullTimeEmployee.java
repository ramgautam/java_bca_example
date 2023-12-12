package edu.ncit.demo.abastract1;

public class FullTimeEmployee extends Employee {
	public FullTimeEmployee(String name, int paymentPerHour) {
		super(name, paymentPerHour);
	}

	@Override
	public int calculateSalary() {
		return getPaymentPerHour() * 8;
	}
}
