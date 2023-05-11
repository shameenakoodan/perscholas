/**
 * 
 */
package perscholas.shameena.whileloop;

import java.util.Scanner;

/**
 * @author homeoffice
 *
 */
public class SubtractionQuizLoop {

	/**
	 * @param args Write a program that generates five single-digit integer
	 *             subtraction problems. Using a while loop, prompt the user to
	 *             answer all five problems. After all of the answers are entered,
	 *             report the number of the correct answers. Offer the user the
	 *             opportunity to play the game again.
	 * 
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = 5;
		int score = 0;
		while(count>0) {
			int number1 = (int)(Math.random()*10);
			int number2 = (int)(Math.random()*10);
			System.out.format("What is %d - %d",number1,number2);
			int enteredResult = scanner.nextInt();
			
			int originalResult = number1 - number2;
			if(enteredResult == originalResult)
				score++;
			else {
				System.out.format("You entered a wrong answer!!!%n %d - %d = %d\n",number1,number2,originalResult);
			}
			count--;
		}
		System.out.format("Wohooo!!You scored %d points",score);
		scanner.close();
	}
	

}
