/**
 * 
 */
package perscholas.shameena.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author homeoffice
 *
 */
public class FunWithAnagram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> string = Arrays.asList("code","doce","gang","angg","ecod","framer","frame");
		System.out.println(funWithAnagrams(string));

	}
	public static List<String> funWithAnagrams(List<String> text) {
		LinkedList<String>  resultList = new LinkedList<>();
		Iterator<String> iterator  = text.iterator();
		String prevString  = iterator.next();
		resultList.add(prevString);
		while(iterator.hasNext()) {
			String newString = iterator.next();
			//System.out.println(prevString  + " " +newString);
			char[] stringArray  = newString.toCharArray();
			Arrays.sort(stringArray);
			char[] prevArray = prevString.toCharArray();
			Arrays.sort(prevArray);
			if(!String.valueOf(stringArray).equals(String.valueOf(prevArray))){
				resultList.add(newString);
				prevString = newString;
				
			}
		}
		

		return resultList;
	}

}
