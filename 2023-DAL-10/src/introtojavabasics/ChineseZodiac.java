/**
 * 
 */
package introtojavabasics;

import java.util.Scanner;

/**
 * @author homeoffice
 *
 */
public class ChineseZodiac {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the year");
		int year = scanner.nextInt();
		int yearMod12 = year % 12;
		String animalString = "";
		switch (yearMod12) {
		case 0:
			animalString = "Monkey";
			break;
		case 1:
			animalString = "Rooster";
			break;
		case 2:
			animalString = "Dog";
			break;
		case 3:
			animalString = "Pig";
			break;
		case 4:
			animalString = "Rat";
			break;
		case 5:
			animalString = "Ox";
			break;
		case 6:
			animalString = "Tiger";
			break;
		case 7:
			animalString = "Rabbit";
			break;
		case 8:
			animalString = "Dragon";
			break;
		case 9:
			animalString = "Snake";
			break;
		case 10:
			animalString = "Horse";
			break;
		case 11:
			animalString = "Sheep";
			break;
		default:
			break;
		}
		System.out.println(animalString);
	}
	

}