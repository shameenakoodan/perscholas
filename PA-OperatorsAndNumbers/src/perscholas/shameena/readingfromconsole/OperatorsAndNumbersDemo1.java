/**
 * 
 */
package perscholas.shameena.readingfromconsole;

/**
 * @author homeoffice
 *
 */
public class OperatorsAndNumbersDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x = 2;
		String binaryString = Integer.toBinaryString(x);
		System.out.println("Binary of "+ x + " is " + binaryString);
		
		/*
		 * Binary of  2  = 0010
		 * 0010 << 1 	 = 0100 
		 * 0100			 = 4
		 */
		x = x<<1;
		System.out.println("After left shift by 1 the value is " + x + "\n");
		
		x=9;
		binaryString = Integer.toBinaryString(x);
		System.out.println("Binary of "+ x + " is " + binaryString);
		/*
		 * Binary of  9 = 1001
		 * 1001 << 1 	= 10010
		 * 10010		= 18
		 */
		x = x<<1;
		System.out.println("After left shift by 1 the value is " + x + "\n");
		
		
		x=17;
		binaryString = Integer.toBinaryString(x);
		System.out.println("Binary of "+ x + " is " + binaryString);
		
		/*
		 * Binary of 17  = 10001
		 * 10001 << 1	 = 100010
		 * 100010		 = 34
		 */
		x = x<<1;
		System.out.println("After left shift by 1 the value is " + x + "\n");
		
		x=88;
		binaryString = Integer.toBinaryString(x);
		System.out.println("Binary of "+ x + " is " + binaryString);
		
		/*
		 * Binary of 88 = 1011000
		 * 1011000 << 1 = 10110000
		 * 10110000 	= 176
		 */
		x = x<<1;
		System.out.println("After left shift by 1 the value is " + x + "\n");
		
		
	}

}