/**
 * 
 */
package introtojavabasics;

import java.util.Scanner;

/**
 * @author homeoffice
 *
 */
public class LeapYear {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		if((year%4 == 0 && year%100 !=0) || year %400==0)
			System.out.println("Yes");
		else {
			System.out.println("No");
		}

	}

}