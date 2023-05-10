/**
 * 
 */
package introtojavabasics;

/**
 * @author homeoffice
 *
 */
public class LoopExamples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i=0;i<100;i++) {
			System.out.println((i+1)+ " Welcome to Java!!!");
		}
		// ---outer loop---
		for(int i=1;i<=5;i++) {
			// codes in the body of the outer loop

			  // ---inner loop--

			System.out.println("Outer loop");
			for(int j=1;j<=2;j++) {
			    // code in the body of both outer and inner loops

				System.out.println("Inner of the Outer Loop");
			}
			
		}
	}
}
