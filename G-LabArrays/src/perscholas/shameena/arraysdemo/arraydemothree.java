/**
 * 
 */
package perscholas.shameena.arraysdemo;

/**
 * @author homeoffice
 *
 */
public class arraydemothree {

	/**
	 * @param args
	 * Compute the Sum and Average of Array Elements

	 */
	public static void main(String[] args) {
		int array[]= {1,2,3,4,5,6,7,8,9};
		int sum = 0;
		for(int i=0;i<array.length;i++)
			sum+=array[i];
		System.out.println("Sum of the array elements = "+ sum);
		
		double average = sum / array.length;
		
		System.out.println("Average of the elements  = "+average);
	}

}
