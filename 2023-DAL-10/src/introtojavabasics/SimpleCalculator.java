/**
 * 
 */
package introtojavabasics;

import java.util.Scanner;

/**
 * @author homeoffice
 *
 */
public class SimpleCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Scanner object to read the numbers from the console
		Scanner inpScanner = new Scanner(System.in);
		//floating point values
		double num1,num2;
		System.out.println("Please enter the first number");
		num1 = inpScanner.nextDouble();
		System.out.println("Please enter the second number");
		num2 = inpScanner.nextDouble();
		double result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
		result = num1 - num2;
		System.out.println(num1 + " - " + num2 + " = " + result);
		result = num1 * num2;
		System.out.println(num1 + " * " + num2 + " = " + result);
		result = num1 / num2;
		System.out.println(num1 + " ÷ " + num2 + " = " + result);
		result = num1 %num2;
		System.out.println(num1 + " % " + num2 + " = " + result);

		inpScanner.close();

	}

}