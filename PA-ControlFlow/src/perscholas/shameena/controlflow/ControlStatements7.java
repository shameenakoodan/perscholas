/**
 * 
 */
package perscholas.shameena.controlflow;

import java.util.Scanner;

/**
 * @author homeoffice
 *
 */
public class ControlStatements7 {

	/**
	 * @param args Create a program that lets the users input their filing status
	 *             and income. Display how much tax the user would have to pay
	 *             according to status and income. The U.S. federal personal income
	 *             tax is calculated based on the filing status and taxable income.
	 *             There are four filing statuses: Single, Married Filing Jointly,
	 *             Married Filing Separately, and Head of Household. The tax rates
	 *             for 2009 are shown below.
	 * 
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System .out.println("What is your filing status ? \n1. Single\n2. Married Filing Jointly\n3. Married Filing Separately\n4. Head of Household");
		System.out.println("Enter the number corresponding to your status");
		int statusNumber = scanner.nextInt();
		System.out.println("What is you annual income?");
		long income = scanner.nextInt();
		int tax = 0;
		String status="";
		switch(statusNumber) {
		case 1:
			status ="Single";
				if(income>=0 && income<=8350)
					tax = 10;
				else if(income>=8351 && income<=33950)
					tax = 15;
				else if(income>=33951 && income<=82250)
					tax = 25;
				else if(income>=82251 && income<=171550)
					tax = 28;
				else if(income>=171551 && income<=372950)
					tax = 33;
				else if(income>=372951)
					tax = 35;
				break;
		case 2:
			status = "Married Filing Jointly";
			if(income>=0 && income<=16700)
				tax = 10;
			else if(income>=16701 && income<=67900)
				tax = 15;
			else if(income>=67901 && income<=137050)
				tax = 25;
			else if(income>=137051 && income<=208850)
				tax = 28;
			else if(income>=208851 && income<=372950)
				tax = 33;
			else if(income>=372951)
				tax = 35;
			break;
		case 3:
			status = "Married Filing Separately";
			if(income>=0 && income<=8350)
				tax = 10;
			else if(income>=8351 && income<=33950)
				tax = 15;
			else if(income>=33951 && income<=68525)
				tax = 25;
			else if(income>=68526 && income<=104425)
				tax = 28;
			else if(income>=104426 && income<=186475)
				tax = 33;
			else if(income>=186476)
				tax = 35;
			break;	
		case 4:
			status ="Head of Household";
			if(income>=0 && income<=11950)
				tax = 10;
			else if(income>=11951 && income<=45500)
				tax = 15;
			else if(income>=45501 && income<=117450)
				tax = 25;
			else if(income>=117451 && income<=190200)
				tax = 28;
			else if(income>=190201 && income<=371950)
				tax = 33;
			else if(income>=372951)
				tax = 35;
			break;	
			default:
				System.out.println("Unable to calculate taxes from the values you entered\nPlease enter appropriate values the next time");
				break;
		}
		//taxableamount = (income *tax)/100;
		if(income<0)
			System.out.println("Entered invalid income");
		else if(statusNumber>4 || statusNumber<1)
			System.out.println("You entered invalid status");
		else 
			System.out.format("When filing for taxes with status %s and annual income %d your tax is %d%%",status,income,tax);
		scanner.close();
	}

}
