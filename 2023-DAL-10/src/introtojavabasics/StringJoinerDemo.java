/**
 * 
 */
package introtojavabasics;

import java.util.StringJoiner;

/**
 * @author homeoffice
 *
 */
public class StringJoinerDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// String joiner demo
		StringJoiner joinNames = new StringJoiner(",");
		// ----Adding values to StringJoiner ----
		joinNames.add("Java");
		joinNames.add("Python");
		joinNames.add("C Sharp");
		joinNames.add("Javascript");
		System.out.println(joinNames);

	}

}
