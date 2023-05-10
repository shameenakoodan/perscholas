/**
 * 
 */
package perscholas.shameena.readingfromconsole;

/**
 * @author homeoffice
 *
 */
public class OperatorsAndNumbersDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x = 150;
		String binaryString = Integer.toBinaryString(x);
		System.out.println("Binary of "+ x + " is " + binaryString);

		/*
		 * Binary of  150  = 10010110
		 * 10010110 >> 2   = 00100101
		 * 00100101		   = 37
		 */
		x = x>>2;
		System.out.println("After right shift by 2 the value is " + x + "\n");
		
		x = 225;
		binaryString = Integer.toBinaryString(x);
		System.out.println("Binary of "+ x + " is " + binaryString);

		/*
		 * Binary of  225  = 11100001
		 * 11100001 >> 2   = 00111000
		 * 00100101		   = 184
		 */
		x = x>>2;
		System.out.println("After right shift by 2 the value is " + x + "\n");

		x = 1555;
		binaryString = Integer.toBinaryString(x);
		System.out.println("Binary of "+ x + " is " + binaryString);

		/*
		 * Binary of  1555		= 11000010011
		 * 11000010011 >> 2		= 00110000100
		 * 00100101		   		= 1552
		 */
		x = x>>2;
		System.out.println("After right shift by 2 the value is " + x + "\n");
		
		x = 32456;
		binaryString = Integer.toBinaryString(x);
		System.out.println("Binary of "+ x + " is " + binaryString);

		/*
		 * Binary of  32456			= 111111011001000
		 * 111111011001000 >> 2		= 001111110110010
		 * 00100101		   			= 8114
		 */
		x = x>>2;
		System.out.println("After right shift by 2 the value is " + x + "\n");
		

	}

}
