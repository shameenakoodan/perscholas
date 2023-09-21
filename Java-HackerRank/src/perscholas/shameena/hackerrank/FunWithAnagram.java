/**
 * 
 */
package perscholas.shameena.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
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
		List<String> string = Arrays.asList("code","doce","gang","angg","ecod","framer","frame","code");
		System.out.println(funWithAnagrams(string));

	}
	public static List<String> funWithAnagrams(List<String> text) {
		List<String> resultList =  new ArrayList<>();
		//Store all the sorted words
		List<String> codedList = new ArrayList<>();
		Iterator<String> iterator  = text.iterator();
		while(iterator.hasNext()) {
			String itemString = iterator.next();
			char codeArray[] = itemString.toCharArray();
			Arrays.sort(codeArray);
			String codeString = String.valueOf(codeArray);
			if(codedList.isEmpty()) {
				resultList.add(itemString);
				codedList.add(codeString);
			}
			else if(!codedList.contains(codeString)){
					resultList.add(itemString);
					codedList.add(codeString);
			}
			
		}
		return resultList;
	}

}
