/**
 * 
 */
package perscholas.shameena.howtouseaninterface;

/**
 * @author homeoffice
 *
 */
public class Rectangle extends Shape implements Movable {
	protected double length,width;
	private int x, y; // x and y coordinates of the point
	
	/** Constructs a MovablePoint instance at the given x and y */
	public Rectangle(int x, int y, double length,double width) {
		this.x = x;
		this.y = y;
		this.length = length;
		super.width = width;
	}
	public Rectangle(double length) {
		this.length = length;
	}
	public Rectangle(double length,double width) {
		this.length = length;
		super.width = width;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + super.width + "]";
	}
	@Override
	public void moveUp() {
		// TODO Auto-generated method stub
		y--;
	}

	@Override
	public void moveDown() {
		// TODO Auto-generated method stub
		y++;
	}

	@Override
	public void moveLeft() {
		// TODO Auto-generated method stub
		x--;
	}

	@Override
	public void moveRight() {
		// TODO Auto-generated method stub
		x++;
	}

	@Override
	public String getCoordinate() {
		return "(" + x + "," + y + ")";
	}

	@Override
	public double getArea() {
		double area = this.length * super.width;
		return area;
	}
	@Override
	public void displayshapName() {
		System.out.println("Drawing a Rectangle of length " + this.length + " and width" + super.width);
	}
}
