/**
 * 
 */
package introtojavabasics;

import java.util.Scanner;

/**
 * @author homeoffice
 *
 */
public class MonetaryUnits {

	/**
	 * @param args
	 * Write a program that lets the user enter decimal dollars and cents, 
	 * and outputs the monetary equivalent in single dollars, quarters, 
	 * dimes, nickels, and pennies.

	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the money");
		double valueEntered = scanner.nextDouble();
		int pennies = (int) (valueEntered * 100);
		int dollar = pennies / 100;
		System.out.println("Dollar = " + dollar);
		int leftover = pennies % 100;
		int quarters = leftover / 25;
		System.out.println("Quarters = " + quarters);
		leftover = leftover % 25;
		int dime = leftover / 10;
		System.out.println("Dime = " + dime);
		leftover = leftover % 10;
		int nickels = leftover / 5;
		System.out.println("Nickels = " + nickels);
		leftover = leftover % 5;
		System.out.println("Pennies = " + leftover);
		  


	}

}