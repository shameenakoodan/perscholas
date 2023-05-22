package perscholas.shameena.collectionsDemo;

import java.util.ArrayList;
import java.util.Comparator;

public class MyMain2 {
	public static void main(String[] args) {
		// create an ArrayList
		ArrayList<String> languages = new ArrayList<>();
		// add elements to ArrayList
		languages.add("Python");
		languages.add("Swift");
		languages.add("C");
		languages.add("JavaScript");
		System.out.println("Unsorted ArrayList: " + languages);
		languages.sort(null);
		System.out.println(languages);
		// sort the ArrayList in ascending order
		languages.sort(Comparator.reverseOrder());
		System.out.println("Sorted ArrayList: " + languages);
	}

}
