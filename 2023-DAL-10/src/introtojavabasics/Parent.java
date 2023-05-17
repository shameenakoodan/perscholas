/**
 * 
 */
package introtojavabasics;

/**
 * @author homeoffice
 *
 */
public class Parent {
	private String name;
	private int age;
	private double compat;
	
	public Parent() {
		super();
	}

	/**
	 * @param name
	 * @param age
	 * @param compat
	 */
	public Parent(String name, int age, double compat) {
		super();
		this.name = name;
		this.age = age;
		this.compat = compat;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getCompat() {
		return compat;
	}

	public void setCompat(double compat) {
		this.compat = compat;
	}
}

