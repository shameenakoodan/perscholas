package perscholas.shameena.genericclassesandmethod;

public class DemoClass {
	//Create a generics method
	//This <T> says that this method is a generic type
	public <T> void genericsMethod(T data) {
		System.out.println("Generics Method : ");
		System.out.println("Data passed: "+ data);
	}
}