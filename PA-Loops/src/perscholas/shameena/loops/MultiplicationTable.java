/**
 * 
 */
package perscholas.shameena.loops;

import java.util.Scanner;

/**
 * @author homeoffice
 *
 */
public class MultiplicationTable {

	/**
	 * @param args Write a program that uses nested for loops to print a
	 *             multiplication table.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		long num = scanner.nextInt();
		System.out.format("Multiplication table for %d is\n", num);
		for (long i = 1; i <= num; i++) {
			for (long j = 1; j <= num; j++) {
				/*
				 * The format specifier %6d is used for the third argument to indicate that the
				 * value should be printed using the %d format conversion with a minimum field
				 * width of 6 characters
				 */
				System.out.format("%6d", i * j);
			}
			System.out.println();
		}
		scanner.close();
	}

}
