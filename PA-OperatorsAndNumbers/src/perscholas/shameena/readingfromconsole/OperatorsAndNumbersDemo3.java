/**
 * 
 */
package perscholas.shameena.readingfromconsole;

/**
 * @author homeoffice
 *
 */
public class OperatorsAndNumbersDemo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x=7,y=17,z;
		/*
		 * x = 00111
		 * y = 10001
		 * x & y = 00001 = 1
		 */
		z = x & y;
		System.out.println(x + " & " + y + " = "+z );
		
		/*
		 * x = 00111
		 * y = 10001
		 * x | y = 10111 = 23
		 */
		z = x | y;
		System.out.println(x + " | " + y + " = "+z );
		
		int before = 10;
		int after = before++;
		System.out.println("Value of before = " + before);
		System.out.println("Value of after 	= " + after);
		
		/*
		 * Three ways to increment value by 1
		 */
		int i = 10;
		System.out.println("Value of i  = "+ i);
		i++;
		System.out.println("Value of i  = "+ i);
		i=i+1;
		System.out.println("Value of i  = "+ i);
		++i;
		System.out.println("Value of i  = "+ i);
		
		
		
	}

}
