
public class Animal {
	public void animalSound() {
	    System.out.println("The animal makes a sound");
	  } 
	static public class Pig extends Animal {
		  public void animalSound() {
		    System.out.println("The pig says: wee wee");
		  }}
	static public class Dog extends Animal {
		  public void animalSound() {
		    System.out.println("The dog says: bow wow");
		  }}
	public class myMain {
		  public static void main(String[] args) {
		    Animal myAnimal = new Animal();  // Create a Animal object
		  // it’s fine because a Pig is a animal by inheritance   
		    Animal myPig = new Pig();  // Create a Pig object
		    Animal myDog = new Dog();  // Create a Dog object
		    myAnimal.animalSound();
		    myPig.animalSound();
		    myDog.animalSound();

		  System.out.println(myAnimal instanceof Animal);    //true
		  System.out.println(myAnimal instanceof Pig);  //false
		  System.out.println(myPig instanceof Pig);  //True
		  System.out.println(myPig instanceof Animal);  //True

		  System.out.println(myAnimal instanceof Dog);  //false
		  System.out.println(myDog instanceof Animal);  //True
		  System.out.println(myDog instanceof Dog);  //True

		  }
	}

}
