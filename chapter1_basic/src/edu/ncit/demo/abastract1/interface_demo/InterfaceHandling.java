package edu.ncit.demo.abastract1.interface_demo;

class SBI implements Bank {

	@Override
	public float rateOfInterest() {
		return 9.15f;
	}

}

class PNB implements Bank {
	public float rateOfInterest() {
		return 9.7f;
	}
}

class InterfaceHandling {
	public static void main(String[] args) {
		Bank b = new SBI();
		System.out.println("ROI: " + b.rateOfInterest());
	}
}
