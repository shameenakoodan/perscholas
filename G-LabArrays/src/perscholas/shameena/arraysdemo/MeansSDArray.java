/**
 * 
 */
package perscholas.shameena.arraysdemo;

/**
 * @author homeoffice
 *
 */
public class MeansSDArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int marks[] = {12,45,77,88,99,22,55};
		int sum = 0;
		for(int i=0;i<marks.length;i++)
			sum+=marks[i];
		double mean = sum / marks.length;
		double standardDev = Math.sqrt((double)(sum*sum) / marks.length - mean * mean);
		System.out.println("Mean is "+mean);
		System.out.println("Standard Deviation is "+standardDev);


	}

}
