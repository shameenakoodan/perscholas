/**
 * 
 */
package perscholas.shameena.readingfromconsole;

import java.util.Scanner;

/**
 * @author homeoffice
 *
 */
public class ReadingStringFromConsole2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a character: ");
		String s = input.nextLine();
		char ch = s.charAt(0);
		System.out.println("The character entered is " + ch);
		input.close();

	}

}
