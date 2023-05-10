/**
 * 
 */
package perscholas.shameena.stringmethods;

/**
 * @author homeoffice
 *
 */
public class equalsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Equals method returns true  if both the object refer to the same character sequence
		 * This returns false because both strings are different
		 */
		String s1 = "PerScholas";
		String s2 = "PerScholas";
		String s3 = new String("PerScholas");
		String s4 = "Teksystem";
		System.out.println(s1.equals(s2));// true
		System.out.println(s1.equals(s3));// true
		System.out.println(s1.equals(s4));// false
	}
}
