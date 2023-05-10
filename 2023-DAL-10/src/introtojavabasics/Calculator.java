/**
 * 
 */
package introtojavabasics;

/**
 * @author homeoffice
 * Calculator - Create a program that adds, 
 * subtract, divides and multiplies two 
 * integers and displays the numbers the those 
 * four results
 */
public class Calculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Declare and assign values to  two variables
		int number1 = 20;
		int number2 = 10;
		
		//Add two numbers and display the result
		int sum = number1 + number2;
		System.out.println(number1 +" + " + number2 + " = " + sum);
		
		//Subtract two numbers and display the result
		int sub = number1 - number2;
				System.out.println(number1 +" - " + number2 + " = " + sub);
		
		//Multiply two numbers and display the result
		int mult = number1 * number2;
		System.out.println(number1 +" * " + number2 + " = " + mult);
		
		//Divide two numbers and display the result
		int div = number1 / number2;
		System.out.println(number1 +" / " + number2 + " = " + div);
		
	}

}
