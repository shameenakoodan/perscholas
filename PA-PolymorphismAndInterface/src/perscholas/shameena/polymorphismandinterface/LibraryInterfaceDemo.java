/**
 * 
 */
package perscholas.shameena.polymorphismandinterface;

/**
 * @author homeoffice
 *
 */
public class LibraryInterfaceDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		KidUser kid1 = new KidUser();
		kid1.setAge(10);
		System.out.println("Age : "+kid1.getAge());
		System.out.println(kid1.registerAccount());
		kid1.setAge(18);
		System.out.println("Age : "+kid1.getAge());
		System.out.println(kid1.registerAccount());

		System.out.println("\n*******************************************************************\n");
		kid1.setBookType("Kids");
		System.out.println("Book type : "+ kid1.getBookType());
		System.out.println(kid1.requestBook());
		kid1.setBookType("Fiction");
		System.out.println("Book type : "+ kid1.getBookType());
		System.out.println(kid1.requestBook());

		System.out.println("\n*******************************************************************\n");
		AdultUser adult1 = new AdultUser();
		adult1.setAge(5);
		System.out.println("Age : "+adult1.getAge());
		System.out.println(adult1.registerAccount());
		adult1.setAge(23);
		System.out.println("Age : "+adult1.getAge());
		System.out.println(adult1.registerAccount());
		
		System.out.println("\n*******************************************************************\n");
		adult1.setBookType("Kids");
		System.out.println("Book Type : "+ adult1.getBookType());
		System.out.println(adult1.requestBook());
		adult1.setBookType("Fiction");
		System.out.println("Book Type : "+ adult1.getBookType());
		System.out.println(adult1.requestBook());
	}

}
