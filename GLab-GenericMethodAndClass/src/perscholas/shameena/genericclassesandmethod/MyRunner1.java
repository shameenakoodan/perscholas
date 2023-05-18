package perscholas.shameena.genericclassesandmethod;

public class MyRunner1 {
	public static void main(String[] args) {
		// initialize generic class
		// with String and Integer data

		GMultipleDatatype<String, Integer> mobj = new GMultipleDatatype<String, Integer>("Per Scholas", 11025);

		System.out.println(mobj.getValueOne());
		System.out.println(mobj.getValueTwo());

		// initialize generic class
		// with String and String data
		GMultipleDatatype<String, String> mobj2 = new GMultipleDatatype<String, String>("Per Scholas", "Non profit");
		System.out.println(mobj2.getValueOne());
		System.out.println(mobj2.getValueTwo());
	}

}
