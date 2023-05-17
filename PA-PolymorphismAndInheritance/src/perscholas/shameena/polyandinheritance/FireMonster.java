/**
 * 
 */
package perscholas.shameena.polyandinheritance;

/**
 * @author homeoffice
 *
 */
public class FireMonster extends Monster {
	private String nameString;
	
	/**
	 * @param nameString
	 */
	public FireMonster(String nameString) {
		super(nameString);
		this.nameString = nameString;
	}

	public String attack() {
		return "Attack with fire!";
	}
}
