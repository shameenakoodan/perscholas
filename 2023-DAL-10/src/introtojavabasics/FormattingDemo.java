/**
 * 
 */
package introtojavabasics;

/**
 * @author homeoffice
 *
 */
public class FormattingDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i = 1024;
		byte b = 127;
		double d = 1.232, tiny = d / 1000000.0;
		boolean bool = true;
		System.out.format(" This is an integer: %d and this is a byte: %d.\r\n", i, b);
		System.out.format(" This is a double: %.4f and this is tiny: %.4e.\r\n", d, tiny);
		System.out.format(" And this is a String: %s", "This is a string.\r\n");
		/*
		 * Sometimes it has an advantage over using %s than using variables.
		 * Example using time and formatting it
		 * But mostly it is numbers
		 * to create a table and put specific number of white spaces will be an example
		 */
		

	}

}