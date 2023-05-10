/**
 * 
 */
package perscholas.shameena.whileloop;

import java.util.Scanner;

/**
 * @author homeoffice
 *
 */
public class GuessTheNumber {

	/**
	 * @param args Write a program that randomly generates an integer between 0 and
	 *             100, inclusive. The program should prompt the user to enter a
	 *             number repeatedly until the number matches the randomly generated
	 *             number.
	 * 
	 */
	public static void main(String[] args) {
		int number = (int) (Math.random() * 101);
		System.out.println(number);
		Scanner scanner = new Scanner(System.in);
		int guess = -1;
		while (guess != number) {
			System.out.println("Guess a magic number between 0 and 100 ");
			guess = scanner.nextInt();
			if (guess == number)
				System.out.println("Success!!");
			else if (guess > number)
				System.out.println("input is too high");
			else {
				System.out.println("input is too low");
			}
		}
		scanner.close();
	}

}
