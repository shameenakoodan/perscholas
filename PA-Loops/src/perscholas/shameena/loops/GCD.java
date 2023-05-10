/**
 * 
 */
package perscholas.shameena.loops;

import java.util.Scanner;

/**
 * @author homeoffice
 *
 */
public class GCD {

	/**
	 * @param args Write a program that prompts the user to enter two positive
	 *             integers, and find their greatest common divisor (GCD). Examples:
	 *             Enter 2 and 4. The gcd is 2. Enter 16 and 24. The gcd is 8. How
	 *             do you find the gcd? Name the two input integers n1 and n2. You
	 *             know number 1 is a common divisor, but it may not be the gcd.
	 *             Check whether k (for k = 2, 3, 4, and so on) is a common divisor
	 *             for n1 and n2, until k is greater than n1 or n2.
	 * 
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter number 1 : \n");
		int a = scanner.nextInt();
		System.out.println("Please enter number 2 : \n");
		int b= scanner .nextInt();
		int gcd =-1;
		for(int i=2;i<a || i<b ;i++) {
			if(a%i==0 & b%i == 0) {
				if(i>gcd) 
					gcd = i;
			}
		}
		if(gcd !=-1)
			System.out.format("Greatest common divisor (GCD) of %d and %d is %d%n", a,b,gcd);
		else {
			System.out.format(" %d and %d has no Greatest common divisor (GCD)", a,b);
		}

	}

}
