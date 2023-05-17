/**
 * 
 */
package introtojavabasics;

import java.util.Arrays;

/**
 * @author homeoffice
 *
 */
public class ArrayTofillDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	     // TODO Auto-generated method stub
	     int[] dValues = new int[10];
	     Arrays.fill(dValues, 6);   // set all values to 6
	     for(int i : dValues) {  // print using loop
	        System.out.println(dValues[i]);
	     }

	     long[] lValues = new long[10];
	     Arrays.fill(lValues, 2057);    // set all values to 2057
	     System.out.println(Arrays.toString(lValues));  // print using toString()   
	     
	     int ar[] = {2, 2, 2, 2, 2, 2, 2, 2, 2};
	      // Fill from index 1 to index 4.
	       Arrays.fill(ar, 1, 5, 10);
	       System.out.println(Arrays.toString(ar)); // print using toString()
	       System.arraycopy(lValues, 0, ar, 0, 0);
	       

	}

}
