package perscholas.shameena.genericclassesandmethod;

public class MyRunner {
	public static void main(String args[]) {
		DemoClass objClass = new DemoClass();
		objClass.genericsMethod(25); // passing int
		objClass.genericsMethod("Per Scholas"); // passing String
		objClass.genericsMethod(2563.5); // passing float
		objClass.genericsMethod('H'); // passing Char

	}
}
