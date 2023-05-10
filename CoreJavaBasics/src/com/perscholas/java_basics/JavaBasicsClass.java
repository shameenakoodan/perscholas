/**
 * 
 */
package com.perscholas.java_basics;

/**
 * @author homeoffice
 *
 */
public class JavaBasicsClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Declare two integer variables
		int number1, number2;

		// Assign value to the variables
		number1 = 20;
		number2 = 10;

		// Add the numbers
		int sum = number1 + number2;

		// Display the result
		System.out.println(number1 + " + " + number2 + " = " + sum);

		// Declare two double variables
		double doubleNumber1, doubleNumber2;

		// Assign value to the variables
		doubleNumber1 = 20.50;
		doubleNumber2 = 10.60;

		// Add the numbers
		double sumofDouble = doubleNumber1 + doubleNumber2;

		// Display the result
		System.out.println(doubleNumber1 + " + " + doubleNumber2 + " = " + sumofDouble);

		// Declare an integer variable and a double variable
		int number3;
		double doubleNumber3;

		// Assign numbers to each
		number3 = 40;
		doubleNumber3 = 10.56;

		// Sum of double and integer
		double doubleNumber4 = number3 + doubleNumber3;

		// Display the result
		System.out.println(number3 + " + " + doubleNumber3 + " = " + doubleNumber4);

		// Declare two integer variables
		int number4, number5;

		// Assign value to the variables
		number4 = 20;
		number5 = 10;
		// Divides the larger number by the smaller number.
		int divide = number4 / number5;

		// Display the result
		System.out.println(number4 + " / " + number5 + " = " + divide);

		// Change larger number to decimal
		// Since floating literals cannot be assigned to integer variables create a new
		// double variable
		// or else we can cast but it will result in loosing decimal values.
		double number6 = 20.5;

		// Declares two double variables and assign values
		double doubleNumber5 = 30.4;
		double doubleNumber6 = 60.7;

		// Divides the larger by the smaller number
		// Assign the result to a variable
		double doubleDivide = doubleNumber6 / doubleNumber5;

		// Print out the result.
		System.out.println(doubleNumber6 + " / " + doubleNumber5 + " = " + doubleDivide);

		// cast the result to an integer
		int castDoubletoInt = (int) doubleDivide;
		// Print out the result again
		System.out.println(doubleNumber6 + " / " + doubleNumber5 + " = " + castDoubletoInt);

		// declares two integer variables, x and y, and assigns the number 5 to x and
		// the number 6 to y
		int x = 5, y = 6;
		// Declare a variable q and assign y/x to it
		int q = y / x;
		// print q
		System.out.println(y + " / " + x + " = " + q);

		double ydouble = (double) y;
		// This throws an error
		// q=ydouble / x;
		// so declare a double to hold the result
		double ydoubleResult = ydouble / x;
		System.out.println("After casting to double");
		System.out.println(ydouble + " / " + x + " = " + q);

		// Declares a named constant
		final int constNumber = 10;

		// Uses it in calculation
		int constantResult = constNumber * 2;

		// Print the result.
		System.out.println(constNumber + " * 2 = " + constantResult);

		/*
		 * Write a program where you create three variables that represent products at a
		 * cafe.
		 */
		double coffeePrice = 5.06;
		double cappuccinoPrice = 10.65;
		double espressoPrice = 30.54;

		// Create two more variables called subtotal and totalSale
		double subtotal;
		double totalSale;

		/*
		 * complete an “order” for three items of the first product, four items of the
		 * second product, and two items of the third product. Add them all together to
		 * calculate the subtotal
		 */
		subtotal = coffeePrice * 3 + 4 * cappuccinoPrice + 2 * espressoPrice;

		// Create a constant called SALES_TAX
		final double SALES_TAX = 3.254;

		// add sales tax to the subtotal to obtain the totalSale amount
		totalSale = subtotal + SALES_TAX;

		// Format the results to two decimal places
		System.out.println(String.format("%.2f", totalSale));

	}

}
