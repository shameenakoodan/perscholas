/**
 * 
 */
package perscholas.shameena.FileHandling;

import java.io.File;
import java.util.Arrays;

/**
 * @author homeoffice
 *
 */
public class FileExampleOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "C:/Users/Downloads/TestingFolder";
	     File dir = new File(path);
	       System.out.println(dir.isDirectory());


	       File[] FilewithPath =  dir.listFiles(); // return an  Array of Files
	       System.out.println(Arrays.toString(FilewithPath));

	}

}
