/**
 * 
 */
package introtojavabasics;

/**
 * @author homeoffice
 *
 */
public class StringMethodDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Creates a new string object and literal 'Today is Friday' is placed in the string constant pool
		String friday = new String("Today is Friday");
		
		/*
		 * find the size of the string
		 * Returns 15 by counting all characters including spaces
		 */
		int fridayLength = friday.length();
		System.out.println("Size of "+friday + " is "+ fridayLength);

		/*
		 * Empty means length is 0
		 * Checks if the length of the string is 0
		 * Returns false because it has a non empty
		 */
		
		boolean isFridayEmpty = friday.isEmpty();
		System.out.println("Is Friday String empty ? "+ isFridayEmpty);
		
		
		/*Blank means it has write spaces and length will be >0
		 * Checks if the characters are all white spaces
		 * Returns false because string literal has non white space characters
		 */
		boolean isFridayBlank = friday.isBlank();
		System.out.println("Is Friday String blank ? "+isFridayBlank);
		
		
		/*
		 * Equals method returns true  if both the object refer to the same character sequence
		 * This returns false because both strings are different
		 */
		String satString = new String("Today is Saturday");
		boolean friEqSat = friday.equals(satString);
		System.out.println("Is friday equals to saturday ? "+friEqSat);
		
		/*
		 * Compares two string literals ignoring their case
		 */
		String friday2 = "today is friday";
		boolean friEq2Sat = friday.equalsIgnoreCase(friday2);
		System.out.println("Is friday2 string equals friday ? "+ friEq2Sat);

		/*
		 * Compares two strings and gives the difference between the 
		 * ascii code of the characters in the string 
		 */
		int comp = friday.compareTo(friday2);
		System.out.println("Comparing friday and friday2 we get : " + comp);
		
		/*Returns the string representation of the argument
		 * This returns -32 whose data type will be string
		 */
		String compString  = String.valueOf(comp);
		System.out.println("Value of "+comp+ " is " +compString);

		//Returns false because the string does not start with 'T'
		boolean startsWithT = friday2.startsWith("T");
		System.out.println("Does friday2 starts with T ? " + startsWithT);
		
		//Returns false because the the string literal does not end with 'Y'
		boolean endsWithY = friday2.endsWith("Y");
		System.out.println("Does friday2 ends with Y ?" + endsWithY);

		//Returns 1 ,i.e, it returns the first occurrence of the argument 'o'
		int indexOfO = friday.indexOf('o');
		System.out.println("First index of 'o' is " + indexOfO);
		
		//Returns 1 ,i.e, it returns the first occurrence of the argument 'y'
		int lastIndexOfy = friday.lastIndexOf('y');
		System.out.println("Last index of Y is "+ lastIndexOfy);

		//Returns true because the string contains letter 'a'
		boolean containsAnA = friday.contains("a");
		System.out.println("Does friday contain an 'a' ? "+ containsAnA);
		
		//save all the words as an array
		System .out.print("Printing the words in an array : ");
		String[] words = friday.split(" ");
		for(int i=0;i<words.length;i++) {
			System.out.print(words[i] + " ");
		}
		System.out.println();
		
		//Print the results of everything at the top
		//And write good comments
		
		
		//write code that extracts the F from friday
		char charF =  friday.charAt(9);
		System.out.println(charF);
		
		//Write code that extracts the substring today and 
		//saves in a new string called today
		String newSubString  = friday.substring(0,5);
		System.out.println(newSubString);
		
		//Convert the string to uppercase and save in another string
		String upperCaseString = friday.toUpperCase();
		System.out.println(upperCaseString);
		//Join friday with ".Thank you for being there and save as another string
		String newJoinedString  = friday.concat("\".Thank you for being there");
		System.out.println(newJoinedString);
		//Replace friday with friday2 and save in new
		//string called friday3 (replace)
		String friday3 = friday.replace("Friday", "Friday2");
		System.out.println("Replaced Friday with Friday2 : \n "+ friday3);
		
		
		
		String intString = "1";
		int intValue = Integer.parseInt(intString);
		Integer  intWrapper= Integer.parseInt(intString);
		
		String doublString = "1";
		double doubleValue = Double.parseDouble(doublString);
		System.out.println(doubleValue);
		Float fwrapper = Float.valueOf(doublString);
		System.out.println(fwrapper);
		
		
	}

}
