/**
 * 
 */
package introtojavabasics;

/**
 * @author homeoffice
 *
 */
public class ArraySum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// an array of numbers
		int[] numbers = { 3, 4, 5, -5, 0, 12 };
		int sum = 0;

		// iterating through each element of the array
		//Assign and accumulate
		for (int number : numbers) {
			sum += number;
		}

		System.out.println("Sum = " + sum);

	}

}