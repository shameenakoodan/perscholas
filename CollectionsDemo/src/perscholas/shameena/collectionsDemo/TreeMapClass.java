package perscholas.shameena.collectionsDemo;

import java.util.TreeMap;

public class TreeMapClass {
	public static void main(String[] args) {
	       TreeMap<Integer, String> mapObj = new TreeMap<>();
	       mapObj.put(1, "Per Scholas New Yok, NY");
	       mapObj.put(2, "Per Scholas Atlanta GA");
	       mapObj.put(3, "Per Scholas Columbas, OH");
	       mapObj.put(3, "Per Scholas  Florida, Orlando");
	       mapObj.put(4, "Per Scholas Chicago, Ill");
	       mapObj.put(5, "Per Scholas Chicago, Ill");
	       mapObj.put(1, "Per Scholas New Jersey , NJ");
	      // mapObj.put(null, "Per Scholas Dallas , TX");
	       mapObj.put(6, null);
	       mapObj.put(7, null);
	       System.out.println(mapObj);
	       
	       TreeMap<String, Integer> numbers = new TreeMap<>();
	       numbers.put("One", 1);
	       numbers.put("Two", 2);
	       numbers.put("Three", 3);
	       System.out.println("TreeMap: " + numbers);
	       // Using entrySet()
	       System.out.println("Key/Value mappings: " + numbers.entrySet());
	      // Using keySet()
	       System.out.println("Keys: " + numbers.keySet());
	       // Using values()
	      System.out.println("Values: " + numbers.values());
	   }

}
