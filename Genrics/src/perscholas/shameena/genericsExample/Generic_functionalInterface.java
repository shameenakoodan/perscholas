package perscholas.shameena.genericsExample;
@FunctionalInterface

public interface Generic_functionalInterface<T> {
		T compare(T a, T b);
	    // we can use as:
	    // int compare(int a, int b)
	    // String compare(String a, String b)


}