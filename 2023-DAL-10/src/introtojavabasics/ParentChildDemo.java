/**
 * 
 */
package introtojavabasics;

/**
 * @author homeoffice
 *
 */
public class ParentChildDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Direct down casting
		 * Child child = new Parent();
		 * This will give error because it will give an error and say please add casting
		 * so we do casting as given below
		 */
		Child c = (Child)new Parent();
		//The abive line gives an error because the types dont match
		//This can be checked using instance of operator
		
		Parent parent  = new Child();
		/*
		 * This works because every child is a parent. This is becasue of inheritance
		 * Child has all the properties of the parent
		 * Create a new parent thats a child
		 */
		Child c2 = new Child();
			Parent parent2 = (Parent)c2;
	}

}
