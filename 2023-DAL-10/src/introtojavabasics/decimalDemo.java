/**
 * 
 */
package introtojavabasics;

import java.text.DecimalFormat;

/**
 * @author homeoffice
 *
 */
public class decimalDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String pattern = "####,####.##";
	      double number = 123456789.123;
	      
	      DecimalFormat numberFormat = new DecimalFormat(pattern);

	      System.out.println(number);
	      
	      System.out.println(numberFormat.format(number));

	}

}
