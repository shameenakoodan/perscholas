package perscholas.shameena.classexcercise;

import java.util.Scanner;

public class PizzaOrder {
	public static void main(String args[]) {
		/*
		 * PizzaOrder class that allows up to three pizzas to be saved in order. Each
		 * pizza saved should be a Pizza object
		 */
		Pizza order[] = new Pizza[3];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter details for Pizza 1 : ");
			System.out.println("What size pizza do you want?small / medium / large");
			String sizeString = scanner.next();
			System.out.println("How many cheese toppings do you want ?");
			int cheese = scanner.nextInt();
			System.out.println("How many pepporoni toppings do you want ?");
			int pepporoni = scanner.nextInt();
			System.out.println("How many ham toppings do you want ?");
			int ham = scanner.nextInt();
			order[i] = new Pizza(sizeString, cheese, pepporoni, ham);
		}
		System.out.println(calcTotal(order));
		scanner.close();

	}

	/*
	 * calcTotal() that returns the cost of the order. In the runner order two
	 * pizzas and return the total cost.
	 */
	static double calcTotal(Pizza[] order) {
		double totalCost = 0;
		for (int i = 0; i < order.length; i++)
			totalCost += order[i].calcCost();
		return totalCost;
	}

}