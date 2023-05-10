/**
 * 
 */
package introtojavabasics;

/**
 * @author homeoffice
 *
 */
public class FormatDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 // The objects to be used during formatting
        String s = "Per Scholas";
        float n = 74.47f;
        // The result formatted String objects
        String str1 = String.format("My Company name is %s", s), str2 = String.format("My age is %.8f", n);
        // Printing the resultant formatted Strings
        System.out.println(str1 + " " + str2);

	}

}
