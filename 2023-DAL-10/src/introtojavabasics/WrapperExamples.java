/**
 * 
 */
package introtojavabasics;

/**
 * @author homeoffice
 *
 */
public class WrapperExamples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Auto boxing example
		int a = 20;
		Integer convertIntoInteger = a;
		
		char c = 'A';
		Character convertIntoCharacter = c;
		
		double d = 565.23;
		Double convertIntoDouble = d;
		
		//Unboxing Example
		Integer i = 56;
		int ii = i;
		
		Character c2 = 'a';
		char ch = c2;
		
		Double d2 = 2563.32;
		double dd = d2;
	}

}
