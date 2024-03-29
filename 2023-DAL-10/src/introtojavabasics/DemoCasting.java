/**
 * 
 */
package introtojavabasics;

/**
 * @author homeoffice
 *
 */
public class DemoCasting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Explicit type casting(narrowing)
		// (target-type) value
		int x;
		double y = 9.99;
		x = (int) y; // Converting a larger data type
		// to a smaller ranged data type
		System.out.println(x);

		byte i = 40;
		// No casting needed for below conversion
		// Implicit type casting / widening/automatic type conversion
		short j = i;
		int k = j;
		long l = k;
		float m = l;
		double n = m;
		System.out.println("byte value : " + i);
		System.out.println("short value : " + j);
		System.out.println("int value : " + k);
		System.out.println("long value : " + l);
		System.out.println("float value : " + m);
		System.out.println("double value : " + n);
		// byte s = (short)k; // Not Allowed - narrowing
		// short c = (char)k; // Not Allowed - narrowing
		float f = 1.5e3f;
		k = (int) f; // Explicit - ok
		// k = f // Not Allowed - narrowing

	}

}
