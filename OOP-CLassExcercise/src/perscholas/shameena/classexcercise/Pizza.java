package perscholas.shameena.classexcercise;

public class Pizza {
	/*
	 * Private instance variables to store the size of the pizza (either small,
	 * medium, or large), the number of cheese toppings, the number of pepperoni
	 * toppings, and the number of ham toppings.
	 */
	private String sizeString;
	private int noOfCheeseToppings;
	private int pepperoni;
	private int ham;

	/**
	 * @param sizeString
	 * @param noOfCheeseToppings
	 * @param pepperoni
	 * @param ham
	 */
	/*
	 * Constructor(s) that set all of the instance variables.
	 */
	public Pizza(String sizeString, int noOfCheeseToppings, int pepperoni, int ham) {
		super();
		this.sizeString = sizeString;
		this.noOfCheeseToppings = noOfCheeseToppings;
		this.pepperoni = pepperoni;
		this.ham = ham;
	}

	/*
	 * Public methods to get and set the instance variables.
	 */
	public String getSizeString() {
		return sizeString;
	}

	public void setSizeString(String sizeString) {
		this.sizeString = sizeString;
	}

	public int getNoOfCheeseToppings() {
		return noOfCheeseToppings;
	}

	public void setNoOfCheeseToppings(int noOfCheeseToppings) {
		this.noOfCheeseToppings = noOfCheeseToppings;
	}

	public int getPepperoni() {
		return pepperoni;
	}

	public void setPepperoni(int pepperoni) {
		this.pepperoni = pepperoni;
	}

	public int getHam() {
		return ham;
	}

	public void setHam(int ham) {
		this.ham = ham;
	}

	/*
	 * A public method named calcCost( ) thatnreturns a double that is the cost of
	 * the pizza. Pizza cost is determined by: Small: $10 + $2 per topping Medium:
	 * $12 + $2 per topping Large: $14 + $2 per topping
	 */
	double calcCost() {
		if (sizeString == "small")
			return 10 + 2 * noOfCheeseToppings + 2 * pepperoni + 2 * ham;
		else if (sizeString == "medium")
			return 12 + 2 * noOfCheeseToppings + 2 * pepperoni + 2 * ham;
		return 14 + 2 * noOfCheeseToppings + 2 * pepperoni + 2 * ham;
	}
	/*
	 * public method named getDescription( ) that returns a String containing the
	 * pizza size, quantity of each topping.
	 */

	String getDescription() {
		return "Size       : " + sizeString + "\n" + "No of cheese toppings = " + noOfCheeseToppings + "\n"
				+ "Pepporoni:" + pepperoni + "\n" + "Ham:" + ham;
	}
}
