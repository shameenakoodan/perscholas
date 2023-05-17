package perscholas.shameena.polyandinheritance;

public class WaterMonster extends Monster {
	private String nameString;
	
	/**
	 * @param nameString
	 */
	public WaterMonster(String nameString) {
		super(nameString);
		this.nameString = nameString;
	}

	public String  attack() {
		return "Attack with water!";
	}
}
