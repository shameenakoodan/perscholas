/**
 * 
 */
package introtojavabasics;

import java.util.Scanner;

/**
 * @author homeoffice
 *
 */
public class RelationalDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3,b = 4;
		boolean r;
		r = (a==b); //equal to
		System.out.println(r);
		r = (a!=b); //not equal to
		System.out.println(r);
		r = (a>b); //greater than
		System.out.println(r);
		r = (a<b); //less than
		System.out.println(r);
		r = (a<=b); //less than or equal to
		System.out.println(r);
		r = (a>=b); //greater than or equal to
		System.out.println(r);
		Scanner inputScanner = new Scanner(System.in);
		System.out.println(inputScanner instanceof Scanner);
		
		System.out.println(a<b && b<a);
		System.out.println(a>b && b<a);
		System.out.println(a<b && b<a);
		System.out.println(a<b && b<a);
	}

}