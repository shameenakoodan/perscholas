/**
 * 
 */
package perscholas.shameena.inhertancecastingoverridingpoly;

/**
 * @author homeoffice
 *
 */
/*
 * This is the parent class
 */
public class Shape {
	private String color;
	   protected double area = 1.0;
	   protected double base = 1.0;
	   protected double width = 1.0;
	   protected double height = 1.0;
	   /** Constructs a Shape instance with only the given color */
	/**
	 * @param color
	 */
	public Shape(String color) {
		super();
		this.color = color;
	}
	public Shape()
	   {

	   }
	/**
	 * @param color
	 * @param area
	 * @param base
	 * @param width
	 * @param height
	 */
	public Shape(String color, double area, double base, double width, double height) {
		super();
		this.color = color;
		this.area = area;
		this.base = base;
		this.width = width;
		this.height = height;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public double getArea() {
		// We have a problem here!
	       // We need to return some value to compile the program.
	       System.out.println("Shape unknown! Cannot compute area!");

		return 0;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	   /** Returns a self-descriptive string */

	@Override
	public String toString() {
		return "Shape [color=" + color + "]";
	}
	
	public void displayshapName()
	   {
	       System.out.println("I am a Shape.");
	   }
}
