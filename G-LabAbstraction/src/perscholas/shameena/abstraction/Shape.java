package perscholas.shameena.abstraction;

public abstract class Shape {
	protected String colorString;
	protected double height;
	protected double width;
	protected double base;
	public String getColorString() {
		return colorString;
	}
	public void setColorString(String colorString) {
		this.colorString = colorString;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public abstract double getArea();
	@Override
	public String toString() {
		return "Shape [colorString=" + colorString + "]";
	}
	public void displayShapeName() {
		System.out.println("I am a Shape.");
	}
}
