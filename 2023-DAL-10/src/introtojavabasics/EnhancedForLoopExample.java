/**
 * 
 */
package introtojavabasics;

import java.util.Iterator;

/**
 * @author homeoffice
 *
 */
public class EnhancedForLoopExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String arr[] = "Today is Friday".split(" ");
		for (String string : arr) {
			System.out.println(string);
		}
	}

}
