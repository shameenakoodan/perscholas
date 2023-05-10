/**
 * 
 */
package introtojavabasics;

import java.util.Calendar;

/**
 * @author homeoffice
 *
 */
public class TestFormat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long n = 461012;
		// %n is used for .format() only
		System.out.format("%d %n", n); // --> "461012"
		System.out.format("%08d%n", n); // --> "00461012"
		System.out.format("%+8d%n", n); // --> " +461012"
		System.out.format("%,8d%n", n); // --> " 461,012"
		System.out.format("%+,8d%n%n", n); // --> "+461,012"

		double pi = Math.PI;

		System.out.format("%f %n", pi); // --> "3.141593"
		System.out.format("%.3f%n", pi); // --> "3.142"
		System.out.format("%10.3f%n", pi); // --> " 3.142"
		System.out.format("%-10.3f%n", pi); // --> "3.142"

		Calendar c = Calendar.getInstance();
		System.out.format("%tB %te, %tY%n", c, c, c); // --> "May 29, 2006"
		System.out.format("%tl:%tM %tp%n", c, c, c); // --> "2:34 am"
		System.out.format("%tD%n", c); // --> "05/29/06"

	}

}
