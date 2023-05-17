package perscholas.shameena.classexcercise;

public class testPizza {

	public static void main(String[] args) {
		// Write test code to create several pizzas and output their descriptions.
		Pizza sampleOrder = new Pizza("large", 1, 1, 2);
		Pizza sampleOrder2 = new Pizza("small", 4, 1, 2);
		Pizza sampleOrder3 = new Pizza("medium", 6, 1, 2);
		System.out.println("You have ordered the foloowing  pizzas");
		System.out.println(sampleOrder.getDescription());
		System.out.println(sampleOrder2.getDescription());
		System.out.println(sampleOrder3.getDescription());

	}

}
