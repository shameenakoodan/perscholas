/**
 * 
 */
package perscholas.shameena.hashsetprocessing;

import java.util.TreeSet;

/**
 * @author homeoffice
 *
 */
public class TreeSetExampleCom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // Create a TreeSet with user-defined comparator
	       TreeSet<String> cities = new TreeSet<>(new cities_Comparator());
	       //add elements to the comparator
	       cities.add("UAE");
	       cities.add("Mumbai");
	       cities.add("NewYork");
	       cities.add("Hyderabad");
	       cities.add("Karachi");
	       cities.add("Xanadu");
	       cities.add("Lahore");
	       cities.add("Zagazig");
	       cities.add("Yingkou");

	       //print the contents of TreeSet
	       System.out.println("TreeSet: " + cities);
	}

}
