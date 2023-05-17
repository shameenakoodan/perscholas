package perscholas.shameena.polymorphismandinterface;

/*
 * Create “AdultUser” which implement the LibraryUser interface
 * Classes should have two instance variables
 * 	int age
 * 	String bookType
 */
public class AdultUser implements LibraryUser {
	private int age;
	private String bookType;

	/**
	 * @param age
	 * @param bookType
	 */
	public AdultUser() {
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

	/*
	 * registerAccount : If age >= 12, a message displaying “You have successfully
	 * registered under an Adult Account.” should be displayed in the console. If
	 * age <= 11, a message displaying, “Sorry, age must be greater than 12 to
	 * register as an adult.” should be displayed in the console.
	 * 
	 */
	@Override
	public String registerAccount() {
		if (age >= 12) {
			return "You have successfully registered under an Adult Account.";
		} else {
			return "Sorry, age must be greater than 12 to register as an adult.";
		}
	}

	/*
	 * requestBook : If bookType is “Fiction,” a message displaying “Book Issued
	 * successfully, please return the book within 7 days.” should be displayed in
	 * the console. Else, a message displaying, “Oops, you are allowed to take only
	 * adult Fiction books.” should be displayed in the console.
	 */
	@Override
	public String requestBook() {
		if (bookType.equals("Fiction"))
			return "Book Issued successfully, please return the book within 7 days.";
		else {
			return "Oops, you are allowed to take only adult Fiction books.";
		}
	}
}
