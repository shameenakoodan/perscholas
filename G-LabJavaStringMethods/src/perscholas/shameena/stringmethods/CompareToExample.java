/**
 * 
 */
package perscholas.shameena.stringmethods;

/**
 * @author homeoffice
 *
 */
public class CompareToExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Compares two strings and gives the difference between the 
		 * ASCII code of the characters in the string 
		 */
		String s1="hello";
		String s2="hello";
		String s3="hemlo";
		String s4="flag";
		System.out.println(s1.compareTo(s2)); // 0 because both are equal
		System.out.println(s1.compareTo(s3)); //-1 because "l" is only one time lower than "m"
		System.out.println(s1.compareTo(s4)); // 2 because "h" is 2 times greater than "f"

	}

}
