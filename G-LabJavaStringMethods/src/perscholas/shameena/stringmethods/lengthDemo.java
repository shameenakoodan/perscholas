/**
 * 
 */
package perscholas.shameena.stringmethods;

/**
 * @author homeoffice
 *
 */
public class lengthDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * This program returns the length of the string
		 * Counts the number of characters if the string including the whitespaces
		 */
		String str1 = "Java";
        String str2 = "";

        System.out.println(str1.length());  // 4
        System.out.println(str2.length());  // 0
        System.out.println("Java".length());  // 4
        System.out.println("Java\n".length()); // 5
        System.out.println("Learn Java".length()); // 10


	}

}
