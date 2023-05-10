/**
 * 
 */
package introtojavabasics;

/**
 * @author homeoffice
 *
 */
public class CharacterClassDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Wrapper character class demo
		Character letterCharacter = new Character('g');
		Character numCharacter = new Character('7');
		System.out.println(letterCharacter);
		System.out.println(numCharacter);

		// Primitive char data type
		char letter_ch = 'g';
		char num_ch = '7';
		System.out.println(num_ch);

		// static method using the actual class name
		// We do not have to create an object
		System.out.println(Character.isDigit(letter_ch));
		System.out.println(Character.isDigit(num_ch));
		System.out.println(Character.isLetter(letter_ch));
		System.out.println(Character.isLetter(num_ch));
		System.out.println(Character.isLetterOrDigit(letter_ch));
		System.out.println(Character.isLetterOrDigit(num_ch));
		System.out.println(Character.isLowerCase(letter_ch));
		System.out.println(Character.isUpperCase(letter_ch));
		System.out.println(Character.toLowerCase(letter_ch));
		System.out.println(Character.toUpperCase(letter_ch));
		
		char charString = 'M';
		String m = String.valueOf(charString);
		

	}

}
