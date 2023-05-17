package perscholas.shameena.inheritancecasting;

public class TestPeople {
	public static void main(String args[]) {
		Person aPerson;
		Boy jimmy;
		Girl betty;
		aPerson = new Person("Fred");
		jimmy = new Boy();
		betty = new Girl("Betty");
		// Boy b = new Person(); // Throw Error - type mismatch error
		// Girl g = new Person() // Throw Error

		System.out.println(aPerson);
		System.out.println(aPerson.talk());
		System.out.println(aPerson.walk());
		System.out.println();

		System.out.println(jimmy);
		System.out.println(jimmy.talk());
		System.out.println(jimmy.walk());
		System.out.println();

		System.out.println(betty);
		System.out.println(betty.talk());
		System.out.println(betty.walk());
		System.out.println();

		System.out.println((Person) jimmy);
		System.out.println(((Person) jimmy).talk());
		System.out.println(((Person) jimmy).walk());
		System.out.println();

		System.out.println((Person) betty);
		System.out.println(((Person) betty).talk());
		System.out.println(((Person) betty).walk());
		System.out.println();

		System.out.println(Person.lifeSpan());
		System.out.println(Boy.lifeSpan());
		System.out.println(Girl.lifeSpan());

		Boy boy = new Boy();
		Person person = (Person) boy;
		// Casting aperson as a boy and calling talk method
		/// this line throws an error because the types dont match when casting
		System.out.println(person.talk());

		/*
		 * ORs
		 */

		Person person2 = new Boy();
		System.out.println(person2.talk());
		/*
		 * When downcasting we instantiate a parent object using the constructor of the
		 * child and then castning as a child
		 * 
		 * or
		 * 
		 * we can create a full child object and assigning the chid to it cast as the
		 * parent
		 */
	}
}
