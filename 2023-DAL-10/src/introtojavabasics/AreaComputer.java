/**
 * 
 */
package introtojavabasics;

/**
 * @author homeoffice
 *
 */
public class AreaComputer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Declaration of our variables
		double radius;
		double area;
		//Assign a radius
		radius = 20;
		// Compute area -assigning the value of radius
		area = Math.pow(radius, 2) * Math.PI;
		
		System.out.println("The area for the circle of radius " + radius+" is "+area);
	}

}