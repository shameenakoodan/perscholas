package jpa.entitymodels;




import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "student")
public class Student {
	@Id
	@Column(name="sEmail",nullable = false)
	private String sEmail;
	
	private String sName;
	
	
	private String sPass;
	

	public Student() {

	}

	/**
	 * @param sEmail
	 * @param sName
	 * @param sPass
	 * @param sCourses
	 */
	public Student(String sEmail, String sName, String sPass) {
		super();
		this.sEmail = sEmail;
		this.sName = sName;
		this.sPass = sPass;
	}

	public String getsEmail() {
		return sEmail;
	}

	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsPass() {
		return sPass;
	}

	public void setsPass(String sPass) {
		this.sPass = sPass;
	}

	
	
}
