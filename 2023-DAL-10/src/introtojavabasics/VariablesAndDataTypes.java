/**
 * 
 */
package introtojavabasics;

/**
 * @author homeoffice
 *
 */
public class VariablesAndDataTypes {

	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
	// A variable is a memory location  - where we save stuff
		byte smallNumber;
		//A middle sized number
		short aLittleBiggerNumber;
		//A little bit bigger
		int aLiitleBitBiggerNumber;
		//long number
		long longerNumber;
		//Decimal value
		double decimalNumber;
		float smallerDecimalNumber;
		
		//String (sequence of characters
		String name;
		String address;
		String password;
		String username;
		
		// True /False
		boolean winOrLoose;
		boolean yesOrNo;
		
		//Single character
		char letterA;
		char ampersand;
		long longval = 3553333333333L;
		System.out.println(longval);
		float flN = 3.5F;
		
		char a = 0101;
		System.out.println(a);
		System.out.println("\\Shameena\\");
		System.out.println("//Shameena//");
		Integer intVal = new Integer(10);
		System.out.println(intVal/2);
	}

}