package shameena.perscholas.functionalinterface;

@FunctionalInterface
public interface Human {
	void say();/* A Single-Abstract-Method */
	// ------------ default method One---------------------

	default void sleep() {
		System.out.println("This is Default Method");
	}

//------------ Static method -------------------------   
	static void communication() {
		System.out.println("this is static method");
	}

}
