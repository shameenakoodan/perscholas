package perscholas.shameena.upcastdowncast;

public class GiftBasket {
	private String basketnameString;
	private int basketCount;
	private String[] itemsStrings;
	
	
	
	/**
	 * 
	 */
	public GiftBasket() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param basketnameString
	 * @param basketNumber
	 */
	public GiftBasket(String basketnameString, int basketNumber) {
		super();
		this.basketnameString = basketnameString;
		this.basketCount = basketNumber;
	}
	public String getBasketnameString() {
		return basketnameString;
	}
	public void setBasketnameString(String basketnameString) {
		this.basketnameString = basketnameString;
	}
	public int getBasketCount() {
		return basketCount;
	}
	public void setBasketCount(int basketNumber) {
		this.basketCount = basketNumber;
	}
	public String[] getItemsStrings() {
		return itemsStrings;
	}
	public void setItemsStrings(String[] itemsStrings) {
		this.itemsStrings = itemsStrings;
	}
}
