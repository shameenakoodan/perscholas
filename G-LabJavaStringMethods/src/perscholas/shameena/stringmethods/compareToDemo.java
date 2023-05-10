/**
 * 
 */
package perscholas.shameena.stringmethods;

/**
 * @author homeoffice
 *
 */
public class compareToDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Compares two strings and gives the difference between the 
		 * ASCII code of the characters in the string 
		 */
		String s1 = "Perscholas";
		String s2 = "Perscholas";
		String s3 = "Perscholas";
		System.out.println(s1.compareTo(s2));// 0
		System.out.println(s1.compareTo(s3));// 1(because s1>s3)
		System.out.println(s3.compareTo(s1));// -1(because s3 < s1 )
	}

}
