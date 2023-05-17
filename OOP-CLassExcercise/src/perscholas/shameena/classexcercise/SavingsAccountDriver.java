package perscholas.shameena.classexcercise;

public class SavingsAccountDriver {

	public static void main(String[] args) {
		/*
		 * Instantiate two different objects of classSavingsAccount, saver1, and saver2,
		 * with balances of $2000.00 and $3000.00, respectively. 
		 */
		SavingsAccount saver1 = new SavingsAccount(2000.00);
		SavingsAccount saver2 = new SavingsAccount(3000.00);
		//Set the annualInterestRate to 3 percent.
		SavingsAccount.modifyInterestRate(3.0);
		//Then calculate the monthlyinterest and print the new balances for each of the savers. 
		saver1.calculateMonthlyInterest();
		saver1.displaysavingsBalance();
		
		saver2.calculateMonthlyInterest();
		saver2.displaysavingsBalance();
		
		//Then set the theannualInterestRate to 4 percent
		SavingsAccount.modifyInterestRate(4.0);
		//calculate the next month's interest, and print the new balances for each of the savers.
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		saver1.displaysavingsBalance();
		saver2.displaysavingsBalance();
	}

}
