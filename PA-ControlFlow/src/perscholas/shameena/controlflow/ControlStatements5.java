package perscholas.shameena.controlflow;

import java.util.Scanner;

public class ControlStatements5 {
	/**
	 * @param args Write a program that uses if-else-if statements to print out
	 *             grades A, B, C, D, F, according to the following criteria: A:
	 *             90-100 B: 80-89 C: 70-79 D: 60-69 F: <60 
	 *             Use the Scanner class to
	 *             accept a number score from the user to determine the letter
	 *             grade. Print out “Score out of range” if the score is less than 0
	 *             or greater than 100.
	 * 
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the score so that you can get graded!!!");
		int score = scanner.nextInt();
		char grade='F';
		if(score >=90 && score<=100)
			grade = 'A';
		else if(score >=90 && score<=89)
			grade = 'B';
		else if(score >=70 && score<=79)
			grade = 'C';
		else if(score >=60 && score<=69)
			grade = 'D';
		else if (score<60)
			grade = 'F';
		System.out.format("For score %d grade is %c",score,grade);
		scanner.close();
	}
}