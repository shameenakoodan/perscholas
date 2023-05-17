/**
 * 
 */
package perscholas.shameena.howtouseaninterface;

/**
 * @author homeoffice
 *
 */
public class myRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Circle c1 = new Circle(1, 2, 2);
		System.out.println("Area of Circle " + c1.getArea());
		System.out.println("Coordinates are " + c1.getCoordinate());

		c1.moveDown();
		System.out.println("After move Down, Coordinates are " + c1.getCoordinate());

		c1.moveRight();
		System.out.println("After move right, Coordinates are " + c1.getCoordinate());

		c1.moveUp();
		System.out.println("After move Up, Coordinates are " + c1.getCoordinate());

		c1.moveLeft();
		System.out.println("After move left, Coordinates are " + c1.getCoordinate());

		System.out.println("--------Test Polymorphism-------");
		Movable c2 = new Circle(5, 10, 200); // upcast
		c2.moveUp();
		System.out.println("After move up , Coordinates are " + c2.getCoordinate());

		c2.moveLeft();
		System.out.println("After move Left , Coordinates are " + c2.getCoordinate());

		//Testing Rectangle
		System.out.println("\n\n--------------------Rectangle--------------------");
		Rectangle r1 = new Rectangle(2,3, 10, 20);
		System.out.println("Area of Rectangle " + r1.getArea());
		System.out.println("Coordinates are " + r1.getCoordinate());
		r1.moveDown();
		System.out.println("After move Down, Coordinates are " + r1.getCoordinate());

		r1.moveRight();
		System.out.println("After move right, Coordinates are " + r1.getCoordinate());

		r1.moveUp();
		System.out.println("After move Up, Coordinates are " + r1.getCoordinate());

		r1.moveLeft();
		System.out.println("After move left, Coordinates are " + r1.getCoordinate());

		System.out.println("--------Test Polymorphism-------");
		Movable r2 = new Rectangle(5,10,10, 200); // upcast
		r2.moveUp();
		System.out.println("After move up , Coordinates are " + r2.getCoordinate());

		r2.moveLeft();
		System.out.println("After move Left , Coordinates are " + r2.getCoordinate());
		
		//Testing Triangle
		System.out.println("\n\n--------------------Triangle--------------------");
		Triangle t1 = new Triangle(2,3, 30, 40);
		System.out.println("Area of Triangle " + t1.getArea());
		System.out.println("Coordinates are " + t1.getCoordinate());
		t1.moveDown();
		System.out.println("After move Down, Coordinates are " + t1.getCoordinate());

		t1.moveRight();
		System.out.println("After move right, Coordinates are " + t1.getCoordinate());

		t1.moveUp();
		System.out.println("After move Up, Coordinates are " + t1.getCoordinate());
		t1.moveLeft();
		System.out.println("After move left, Coordinates are " + t1.getCoordinate());

		System.out.println("--------Test Polymorphism-------");
		Movable r3 = new Rectangle(5,10,10, 200); // upcast
		r3.moveUp();
		System.out.println("After move up , Coordinates are " + r3.getCoordinate());

		r3.moveLeft();
		System.out.println("After move Left , Coordinates are " + r3.getCoordinate());
	}

}