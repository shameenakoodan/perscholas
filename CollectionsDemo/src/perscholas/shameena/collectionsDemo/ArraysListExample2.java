/**
 * 
 */
package perscholas.shameena.collectionsDemo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author homeoffice
 *
 */
public class ArraysListExample2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<>();
		al.add("Jack");
		al.add("Tyler");
		al.add("James");
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
