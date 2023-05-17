/**
 * 
 */
package perscholas.shameena.encapsulation;

/**
 * @author homeoffice
 *
 */
public class Student {
	private int studentID;
	private String firstName;
	private String lastName;
	private String studentEmail;
	private long studentPhone;
	
	public Student() {
		studentID = 0;
		firstName="";
		lastName="";
		studentEmail="";
		studentPhone = 0L;
		
	}

	/**
	 * @param studentID
	 * @param firstName
	 * @param lastName
	 * @param studentEmail
	 * @param studentPhone
	 */
	public Student(int studentID, String firstName, String lastName, String studentEmail, long studentPhone) {
		super();
		this.studentID = studentID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentEmail = studentEmail;
		this.studentPhone = studentPhone;
	}
	/*Homework*
	 *format the studentID so it looks like how it is displayed 
	 *in the slide and studentPhone
	 */

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public long getStudentPhone() {
		return studentPhone;
	}

	public void setStudentPhone(long studentPhone) {
		if(String.valueOf(studentPhone).length()!=10)
			System.out.println("Invalid Phone Number");
		else
			this.studentPhone = studentPhone;
	}
	
}
