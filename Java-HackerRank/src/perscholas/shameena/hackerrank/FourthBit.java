/**
 * 
 */
package perscholas.shameena.hackerrank;

/**
 * @author homeoffice
 *
 */
public class FourthBit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(fourthBit(90998));

	}

	public static int fourthBit(int number) {
        String binaryString = Integer.toBinaryString(number);
        StringBuilder brBuffer = new StringBuilder(binaryString);
        brBuffer.reverse();
        int bit = brBuffer.charAt(3);
        String s = Character.toString((char)bit);
        return Integer.parseInt(s);
    }
}
