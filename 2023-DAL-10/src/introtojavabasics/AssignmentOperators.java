/**
 * 
 */
package introtojavabasics;

/**
 * @author homeoffice
 *
 */
public class AssignmentOperators {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x = 5;
		System.out.println(x);
		// This is equivalent to x = x+5
		x += 5; // x = x + 5
		System.out.println(x);

		// This is equivalent to x = x-5
		x -= 5; // x = x - 5
		System.out.println(x);

		// This is equivalent to x = x*5
		x *= 5; // x = x * 5
		System.out.println(x);

		// This is equivalent to x = x/5
		x /= 5; // x = x / 5
		System.out.println(x);

		// This is equivalent to x = x%5
		x %= 5; // x = x % 5
		System.out.println(x);

		// The left shift operator moves all bits by a given number of bits to the left.
		x <<= 5; // x = x << 5
		System.out.println(x);

		// The right shift operator moves all bits by a given number of bits to the
		// right.
		x >>= 5; // x = x >> 5
		System.out.println(x);

		// This operator is a binary operator, denoted by ‘&.’ It returns bit by bit AND
		// of
		// input values, i.e., if both bits are 1, it gives 1, else it shows 0.
		x &= 5; // x = x & 5
		System.out.println(x);
		/*
		 * "^" is an operator in Java that provides the answer '1' if both of the bits
		 * in its operands are different, if both of the bits are same then the XOR
		 * operator gives the result '0'
		 */
		x ^= 5; // x ^= 5
		System.out.println(x);

		/*
		 * This operator is a binary operator, denoted by ‘|’. It returns bit by bit OR
		 * of input values, i.e., if either of the bits is 1, it gives 1, else it shows
		 * 0.
		 */
		x |= 5; // x = x | 5
		System.out.println(x);
	}

}
