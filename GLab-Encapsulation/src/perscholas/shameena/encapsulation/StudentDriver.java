/**
 * 
 */
package perscholas.shameena.encapsulation;

/**
 * @author homeoffice
 *
 */
public class StudentDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student sean = new Student();
		sean.setStudentID(1);
		sean.setFirstName("Sean");
		sean.setLastName("Corbett");
		sean.setStudentEmail("sean.corbett@gmail.com");
		sean.setStudentPhone(9081283287L);
		
		Student shameena = new Student(1,"Shameena","Koodan","shameena.koodan@gmail.com",9081283287L);
		System.out.println("First Name : "+shameena.getFirstName()
				+ "Last Name : "+shameena.getLastName()
				+ "Id : "+shameena.getStudentID()
				+ "Email : "+shameena.getStudentEmail()
				+ "Phone : "+shameena.getStudentPhone());
	}

}
