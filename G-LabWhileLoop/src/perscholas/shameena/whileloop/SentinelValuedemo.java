/**
 * 
 */
package perscholas.shameena.whileloop;

import java.util.Scanner;

/**
 * @author homeoffice
 *
 */
public class SentinelValuedemo {

	/**
	 * @param args
	 * 
	 *             Write a program that reads and calculates the sum of an
	 *             unspecified number of integers. The input 0 signifies the end of
	 *             the input. If data is not 0, it is added to the sum, and the next
	 *             input data are read. If data is 0, the loop body is not executed,
	 *             and the while loop terminates. If the first input read is 0, the
	 *             loop body never executes, and the resulting sum is 0.
	 * 
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int number;
		do {
			System.out.println("Enter the value!!!");
			number = scanner.nextInt();
			if (number == 0)
				break;
			else {
				sum += number;
			}
		} while (number != 0);
		System.out.println("Sum of the given number is " + sum);
		scanner.close();
	}

}
