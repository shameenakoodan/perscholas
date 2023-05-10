/**
 * 
 */
package perscholas.shameena.loops;

import java.util.Scanner;

/**
 * @author homeoffice
 *
 */
public class PredictFutureTuition {

	/**
	 * @param args Suppose the tuition for a university is $10,000 for the current
	 *             year and increases by 7 percent every year. In how many years
	 *             will the tuition be doubled?
	 * 
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What's your tution for this year ?");
		double tution = scanner.nextDouble();
		double original = tution;
		System.out.println("What's the increase percentage for a year ? ");
		double percentage = scanner.nextDouble();
		
		//find the double of the original tution
		double doubletution = tution*2;
		int years = 0;
		double totalAmountForAYear = 0;
		/*
		 * Use a do while loop to calculate the tution increase per year and 
		 * count the number of years until it becomes double
		 */
		do {
			double amountincreasedperyear = tution * (percentage/100);
			totalAmountForAYear = amountincreasedperyear + tution;
			tution = totalAmountForAYear;
			years++;
			
		}while(totalAmountForAYear <= doubletution);
		System.out.format("If the tuition is %f for the current year,and it increases at %.2f%% per year %nthen the tution will be doubled in %d years",original,percentage,years);
		scanner.close();
	}

}
