/**
 * 
 */
package perscholas.shameena.loopdemo;

import java.util.Scanner;

/**
 * @author homeoffice
 *
 */
class CheckthePalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string");
		String originalString = scanner.nextLine();
		scanner.close();
		//Find the reverse
		String reverseString = "";
		for(int i=originalString.length()-1;i>=0;i--) {
			reverseString +=originalString.charAt(i);
		}
		if (reverseString.equals(originalString)) {
			System.out.format("%s is a palindrome",originalString);
		}
		else {
			System.out.format("%s is not a palindrome",originalString);
		}
	}

}
