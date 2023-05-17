package perscholas.shameena.classexcercise;

public class SavingsAccount {
	// static data member annualInterestRate to store the annual interest rate for
	// each of the savers.
	static double annualInterestRate = 0;
	// a private data member savingsBalance indicating the amount the saver
	// currently has on deposit
	private double savingsBalance;
	double monthlyInterest;
	public SavingsAccount(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	/*
	 * member function calculateMonthlyInterest that calculates the monthlyinterest
	 * by multiplying the balance by annualInterestRate divided by 12; this interest
	 * should be added to savingsBalance.
	 */
	void calculateMonthlyInterest() {
		monthlyInterest = savingsBalance * annualInterestRate / 1200;
		savingsBalance += monthlyInterest;
	}
	void displaysavingsBalance() {
		System.out.println("Savings balance is : "+savingsBalance);
	}
	/*
	 * Provide a static member function modifyInterestRate that sets the static
	 * annualInterestRate to a new value
	 */
	static void modifyInterestRate(double rate) {
		annualInterestRate  = rate;
	}	
}
