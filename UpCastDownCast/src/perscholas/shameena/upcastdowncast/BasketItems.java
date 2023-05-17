/**
 * 
 */
package perscholas.shameena.upcastdowncast;

import java.awt.ItemSelectable;
import java.util.Scanner;

/**
 * @author homeoffice
 *
 */
public class BasketItems extends GiftBasket {
	
	private String items[];
	Scanner scanner = new Scanner(System.in);
	String basketItem;
	public BasketItems(int itemsCount) {
		items = new String[itemsCount];
		
	}
	public void printBasketItems() {
		for (int i = 0; i < items.length; i++) {
			System.out.println(items[i]);
		}
		
	}
	public void getGiftItems() {
		for(int i=0;i<getBasketCount();i++) {
			System.out.println("Please enter basket item : ");
			basketItem = scanner.nextLine();
			items[i] = basketItem;
		}
	}
}
