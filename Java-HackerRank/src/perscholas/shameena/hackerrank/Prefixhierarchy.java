/**
 * 
 */
package perscholas.shameena.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * @author homeoffice
 *
 */
public class Prefixhierarchy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> nameStrings  =Arrays.asList("Jack","Jackass","John");
		List<String> query  =Arrays.asList("Jack","Jim");

		System.out.println(findCompletePrefixes(nameStrings, query));

	}
	public static List<Integer> findCompletePrefixes(List<String> names, List<String> query) {
	    LinkedHashMap<String,Integer> hashmap = new LinkedHashMap<>();
	    for(String name:names){
	        for(String item:query){
	            if(name.startsWith(item) && name.length()>item.length())
	            {
	                if(!hashmap.containsKey(item))
	                    hashmap.put(item,0);
	                else
	                    hashmap.put(item,hashmap.get(item)+1);
	            }
	        }
	    }
	    List<Integer> countList = new ArrayList<Integer>(hashmap.values());

	    return countList;
	    }

}
