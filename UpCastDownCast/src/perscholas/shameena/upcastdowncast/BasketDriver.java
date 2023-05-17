/**
 * 
 */
package perscholas.shameena.upcastdowncast;

/**
 * @author homeoffice
 *
 */
public class BasketDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//We want a basket for mom - we are in a hurry
		GiftBasket gb = new GiftBasket("Mothers Day Basket 1",5);
		System.out.println(gb.getBasketnameString() + " # of items "+gb.getBasketCount());
		
		
		//Customer who wants details
		BasketItems  bi = new BasketItems(gb.getBasketCount());
		GiftBasket gb2 = bi;
		
		//They want to see what is in the gift basket
		BasketItems bi2 = (BasketItems) gb2;
		bi2.setBasketnameString(gb.getBasketnameString());
		bi2.getGiftItems();
		bi2.printBasketItems();
		/*
		 * Example of downcasting . We can down cast to class that has the details of
		 * the gift basket Parent class does all the general stuff and child class does
		 * all the specific details
		 */
	}

}
