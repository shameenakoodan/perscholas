/**
 * 
 */
package perscholas.shameena.controlflow;

import java.util.Scanner;

/**
 * @author homeoffice
 *
 */
public class ControlStatements6 {

	/**
	 * @param args Write a program that accepts an integer between 1 and 7 from the
	 *             user. Use a switch statement to print out the corresponding
	 *             weekday. Print “Out of range” if the number is less than 1 or
	 *             greater than 7. Do not forget to include “break” statements in
	 *             each of your cases.
	 * 
	 */
	
	public static void main(String[] args) {
		System.out.println("Please enter a value between 1 and 7");
		Scanner scanner = new Scanner(System.in);
		int day = scanner.nextInt();
		switch(day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
			default:
				System.out.println("Out of range");
		}
		scanner.close();
	}

}
