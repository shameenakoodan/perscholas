/**
 * 
 */
package perscholas.shameena.hashsetprocessing;

import java.util.HashSet;

/**
 * @author homeoffice
 *
 */
public class exampleOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> evenNumberHashSet = new HashSet<>();
		//Using add() method
		evenNumberHashSet.add(10);
		evenNumberHashSet.add(12);
		evenNumberHashSet.add(30);
		System.out.println(evenNumberHashSet);
		
		//Using addAll method
		HashSet<Integer> numberSet  = new HashSet<>();
		numberSet.addAll(evenNumberHashSet);
		System.out.println(numberSet);
	}

}
