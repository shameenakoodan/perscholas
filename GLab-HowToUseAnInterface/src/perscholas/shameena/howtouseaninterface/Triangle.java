/**
 * 
 */
package perscholas.shameena.howtouseaninterface;

/**
 * @author homeoffice
 *
 */
public class Triangle extends Shape implements Movable {
	protected double height,base;
	int x,y;
	public Triangle(int x,int y,double height,double base) {
		this.x =x;
		this.y=y;
		super.height=height;
		super.base = base;
	}
	public Triangle(double height,double base) {
		super.height = height;
		super.base = base;
	}
	@Override
	   public double getArea() {
	       double area = (super.height * super.base)/2; // initializing value in parent class variable
	       return area; //reference to  parent class variable
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

}
