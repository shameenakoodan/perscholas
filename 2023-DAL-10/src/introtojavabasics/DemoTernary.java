/**
 * 
 */
package introtojavabasics;

import java.util.Scanner;

/**
 * @author homeoffice
 *
 */
public class DemoTernary {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner inpScanner = new Scanner(System.in);
		int yourAge;
		System.out.println("Please enter your age");
		yourAge = inpScanner.nextInt();
		String resultString = yourAge<21?"You are younger than Shameena":"You are older than Shameena";
		System.out.println(resultString);
		
		int userNumber;
		System.out.println("Please enter your user number");
		userNumber = inpScanner.nextInt();
		
		boolean isEven = (userNumber % 2) == 0;
		System.out.println("Is it even or not ? " +  isEven);
		
		//What day is it in 10 days
		String[] days ={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		String todayString = "Saturday";
		int positionOfTuesday = (6+10)%7;
		System.out.println(positionOfTuesday);
		inpScanner.close();
		
	}

}