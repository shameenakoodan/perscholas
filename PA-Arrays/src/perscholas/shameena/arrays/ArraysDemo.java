/**
 * 
 */
package perscholas.shameena.arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author homeoffice
 *
 */
public class ArraysDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Task 1: Write a program that creates an array of integers with a length of 3.
		 * Assign the values 1, 2, and 3 to the indexes. Print out each array element.
		 */
		System.out.println("Task 1");
		//creates an array of integers with a length of 3
		int intArray[] = new int[3];
		//Assign the values 1, 2, and 3 to the indexes
		intArray[0] = 1;
		intArray[1] = 2;
		intArray[2] = 3;
		
		//Print out each array element
		System.out.println("Array Elements are : ");
		System.out.println("Element 1 : " + intArray[0]);
		System.out.println("Element 2 : " + intArray[1]);
		System.out.println("Element 3 : " + intArray[2]);
		System.out.println();
		
		/*
		 * Task 2: Write a program that returns the middle element in an array. Give the
		 * following values to the integer array: {13, 5, 7, 68, 2} and produce the
		 * following output: 7
		 */
		System.out.println("Task 2");
		int intArray2[] = { 13, 5, 7, 68, 2 };
		int middlePosition = intArray2.length / 2;
		System.out.println(
				"Middle element of the array " + Arrays.toString(intArray2) + " is " + intArray2[middlePosition]);
		System.out.println();
		
		/*
		 * Task 3: Write a program that creates an array of String type and initializes
		 * it with the strings “red,” “green,” “blue,” and “yellow.” Print out the array
		 * length. Make a copy using the clone( ) method. Use the Arrays.toString( )
		 * method on the new array to verify that the original array was copied.
		 * 
		 */
		System.out.println("Task 3");
		String colorsArray[] = { "red", "green", "blue", "yellow" };
		int lengthOfArray = colorsArray.length;
		System.out.println("Length of the array " + Arrays.toString(colorsArray) + " is " + lengthOfArray);
		String colorsArrayClone[] = colorsArray.clone();
		System.out.println("New array after using clone() method is " + Arrays.toString(colorsArrayClone));
		System.out.println();
		/*
		 * Task 4: Write a program that creates an integer array with 5 elements (i.e.,
		 * numbers). The numbers can be any integers. Print out the value at the first
		 * index and the last index using length - 1 as the index. Now try printing the
		 * value at index = length (e.g., myArray[myArray.length] ). Notice the type of
		 * exception which is produced. Now try to assign a value to the array index 5.
		 * You should get the same type of exception.
		 * 
		 */
		System.out.println("Task 4");
		int[] intArray3 = { 1, 2, 3, 4, 5 };
		System.out.println("Array is " + Arrays.toString(intArray3));
		System.out.println("Element at the first index is " + intArray3[0]);
		System.out.println("Element at the last index is " + intArray3[intArray3.length - 1]);
		// This line will throw ArrayIndexOutOfBoundException because we are trying to
		// access an idex that doesnot exist in the given array
		// System.out.println("Element at index 5 is " + intArray3[5]);
		// Assigning new value for index 5
		// This also throws an ArrayIndexOutOfBoundException
		// intArray3[5] = 10;
		System.out.println();
		/*
		 * Task 5: Write a program where you create an integer array with a length of 5.
		 * Loop through the array and assign the value of the loop control variable
		 * (e.g., i) to the corresponding index in the array.
		 * 
		 */
		System.out.println("Task 5");
		int[] intArray4 = new int[5];
		for (int i = 0; i < intArray4.length; i++)
			intArray4[i] = i;
		System.out.println("Array after assigning index value = " + Arrays.toString(intArray4));
		System.out.println();
		/*
		 * Task 6: Write a program where you create an integer array of 5 numbers. Loop
		 * through the array and assign the value of the loop control variable
		 * multiplied by 2 to the corresponding index in the array.
		 * 
		 */
		System.out.println("Task 6");
		int[] intArray5 = new int[5];
		for (int i = 0; i < intArray5.length; i++)
			intArray5[i] = i * 2;
		System.out.println("Array after assigning index value = " + Arrays.toString(intArray5));
		System.out.println();
		/*
		 * Task 7: Write a program where you create an array of 5 elements. Loop through
		 * the array and print the value of each element, except for the middle (index
		 * 2) element.
		 */
		System.out.println("Task 7");
		int[] intArray6 = { 2, 5, 8, 12, 45 };
		System.out.println("Given array is : " + Arrays.toString(intArray6));
		middlePosition = intArray6.length / 2;
		System.out.print("Elements of the array except the middle element is : ");
		for (int i = 0; i < intArray6.length; i++) {
			if (i != middlePosition)
				System.out.print(intArray6[i] + " ");
		}
		System.out.println();
		System.out.println();
		/*
		 * Task 8: Write a program that creates a String array of 5 elements and swaps
		 * the first element with the middle element without creating a new array.
		 * 
		 */
		System.out.println("Task 8");
		String[] colorsArrayStrings = { "red", "blue", "green", "orange", "pink" };
		System.out.println("String array is " + Arrays.toString(colorsArrayStrings));
		int middle = colorsArrayStrings.length / 2;
		String midElementString = colorsArrayStrings[middle];
		// Swapping array element values
		colorsArrayStrings[middle] = colorsArrayStrings[0];
		colorsArrayStrings[0] = midElementString;
		System.out
				.println("After swapping first and middle element the array is " + Arrays.toString(colorsArrayStrings));
		System.out.println();
		/*
		 * Task 9: Write a program to sort the following int array in ascending order:
		 * {4, 2, 9, 13, 1, 0}. Print the array in ascending order, and print the
		 * smallest and the largest element of the array. The output will look like the
		 * following: Array in ascending order: 0, 1, 2, 4, 9, 13 The smallest number is
		 * 0 The biggest number is 13
		 * 
		 */
		System.out.println("Task 9");
		int[] intArray7 = { 4, 2, 9, 13, 1, 0 };
		System.out.println("Given array is " + Arrays.toString(intArray7));
		Arrays.sort(intArray7);
		System.out.println("Array in ascending order: " + Arrays.toString(intArray7));
		System.out.println("The smallest number is " + intArray7[0]);
		System.out.println("The biggest number is " + intArray7[intArray7.length - 1]);
		System.out.println();
		/*
		 * Task 10: Create an array that includes an integer, 3 strings, and 1 double.
		 * Print the array.
		 * 
		 * Polymorphism would let you store multiple type of object, if they are derived
		 * from same class. And every object in Java is derived(inherited) from the
		 * class call Object. Using this, you can do something like this:
		 * 
		 * Object[] array = new Object[CAPACITY];
		 * 
		 * This array can hold anything, because every object in Java is derived from
		 * Object class.
		 */
		System.out.println("Task 10");
		Object[] intStringDouble = new Object[5];
		intStringDouble[0] = 1;
		intStringDouble[1] = "Welcome ";
		intStringDouble[2] = "to ";
		intStringDouble[3] = "Java ";
		intStringDouble[4] = 12.3;
		System.out.println(Arrays.toString(intStringDouble));
		System.out.println();
		/*
		 * Task 11: Write some Java code that asks the user how many favorite things
		 * they have. Based on their answer, you should create a String array of the
		 * correct size. Then ask the user to enter the things and store them in the
		 * array you created. Finally, print out the contents of the array.
		 * 
		 * 
		 * Example How many favorite things do you have? 7
		 * 
		 */
		System.out.println("Task 11");
		System.out.println("How many favorite things do you have ?");
		Scanner scanner = new Scanner(System.in);
		int favNumber  = scanner.nextInt();
		String[] favoriteArray = new String[favNumber];
		for(int i=0;i<favNumber;i++) {
			System.out.println("Enter your favorite ");
			//
			favoriteArray[i] = scanner.next();
			
		}
		System.out.println(Arrays.toString(favoriteArray));
		scanner.close();
	}

}
