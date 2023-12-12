package edu.ncit.demo.exception.userdefined;

public class InsufficientFundsException extends Exception {
	   /**
		 * 
		 */
	private static final long serialVersionUID = 1L;
	private double amount;

	public InsufficientFundsException(double amount) {
		super("Insufficient amount<><<>"+ amount+"");
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}
}


//1) LateOfficeReachException- you are late today

//2) CheckingLateEmployee

// 3) OffinceAttendanceDemo


