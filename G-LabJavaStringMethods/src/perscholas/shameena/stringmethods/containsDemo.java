/**
 * 
 */
package perscholas.shameena.stringmethods;

/**
 * @author homeoffice
 *
 */
public class containsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Checks whether the method contains the given string
		 */
		String str1 = "Learn Java";
		Boolean result;

	    // check if str1 contains "Java"
	    result = str1.contains("Java");
	    System.out.println(result);  // true

	    // check if str1 contains "Python"
	    result = str1.contains("Python");
	    System.out.println(result);  // false

	    // check if str1 contains ""
	    result = str1.contains("");

	    System.out.println(result);  // t

	}

}
