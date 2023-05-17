package perscholas.shameena.polymorphismandinterface;

/*
 * Create the class “AdultUser” which implement the LibraryUser interface
 * classes should have two instance variables as specified below.
 *  int age
 *  String bookType
 */
public class KidUser implements LibraryUser {
	private int age;
	private String bookType;

	/**
	 * @param age
	 * @param bookType
	 */
	public KidUser() {
		super();

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBookType() {
		return bookType;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}

	@Override
	/*
	 * registerAccount: If age <= 11, a message displaying “You have successfully
	 * registered under a Kids Account” should be displayed in the console. If (age
	 * > 11), a message displaying, “Sorry, age must be less than 12 to register as
	 * a kid.” should be displayed in the console.
	 */
	public String registerAccount() {
		if (age <= 11) {
			return "You have successfully registered under a Kids Account";
		} else {
			return "Sorry, age must be less than 12 to register as a kid.";
		}
	}

	/*
	 * requestBook: If bookType is “Kids,” a message displaying “Book issued
	 * successfully, please return the book within 10 days” should be displayed in
	 * the console. Else, a message displaying, “Oops, you are allowed to take only
	 * kids books.” should be displayed in the console.
	 */

	@Override
	public String requestBook() {
		if (bookType.equals("Kids"))
			return "Book issued successfully, please return the book within 10 days";
		else {
			return "Oops, you are allowed to take only kids books.";
		}
	}
}
