/**
 * 
 */
package perscholas.shameena.polyandinheritance;

/**
 * @author homeoffice
 *
 */
public class StoneMonster extends Monster {
	private String nameString;
	
	/**
	 * @param nameString
	 */
	public StoneMonster(String nameString) {
		super(nameString);
		this.nameString = nameString;
	}

	public String attack() {
		return "Attack with stones!";
	}
}
