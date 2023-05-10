/**
 * 
 */
package introtojavabasics;

import java.util.Scanner;

/**
 * @author homeoffice
 *
 */
public class LearningScanner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// How to create a Scanner object
		Scanner inputScanner = new Scanner(System.in);
		/*
		 * Scanner comes from the util package The compiler automatically imports the
		 * System package for us So we don't have to import it explicitly
		 * 
		 */
		// Declare a variable of type double
		double userNumber;
		// Ask user to enter a decimal value
		System.out.println("Please enter a decimal value : ");
		userNumber = inputScanner.nextDouble();
		System.out.println("You entered " + userNumber);
		inputScanner.nextLine();
		System.out.println("Please enter your name");
		
		String nameString  = inputScanner.nextLine();
		
		System.out.println(nameString);
		inputScanner.close();
		
	}

}
