/**
 * 
 */
package introtojavabasics;

import java.util.Scanner;

/**
 * @author homeoffice
 *
 */
public class TimeConversion {

	/**
	 * @param args
	 * Write a Java program to convert a total amount of seconds to 
	 * the hour, minute, and seconds.

	 */
	public static void main(String[] args) {
		int seconds = 86399;
		int minutes = seconds / 60 ;
		int remainingseconds = seconds %60;
		int hour = minutes/60;
		int remainingMinutes = minutes%60;
		System.out.println("Hours" + hour);
		System.out.println("Minutes" + remainingMinutes);
		System.out.println("Seconds" + remainingseconds);

	}

}
