/**
 * 
 */
package perscholas.shameena.FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author homeoffice
 *
 */
public class ScannerExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		try {
			// ------- change the location of the file-----.
			File file = new File("C:/Users/testingFile.txt");
			Scanner sc = new Scanner(file);
			String data = "";
			while (sc.hasNextLine()) {
				data = sc.nextLine();
				System.out.println(data);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Either file is not found or file is not able to access");
			System.out.println(e.getStackTrace());
			e.printStackTrace();
		}

	}

}
