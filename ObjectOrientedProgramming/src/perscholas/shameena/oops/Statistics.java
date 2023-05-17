/**
 * 
 */
package perscholas.shameena.oops;


/**
 * @author homeoffice
 *
 */
public class Statistics {
	//Class fields /variables/attributes
	private int nSamples;
	private double min = Double.MAX_VALUE,max=Double.MIN_VALUE,sum;
	/*
	 * These can be declared any where in the program but we usually define at the top because it is a convention
	 * For local variables JVM doesnot assign a default value but for class variables it does
	 * Class variables are global
	 * class variables are members of the class
	 * local variables are members of the method
	 * Acces modifeirs show the tyoe of access we have
	 * public means it is visible to all other class
	 * private means only visbie to current class
	 * Even when we create inherited classes it still wont be able to access private variables
	 * default means it is accesibke to all classes and clsses in the same package
	 * protected is visible to current class and all of its child classes. If we create a child class in 
	 * a different package we can still access that protected member
	 */
	//construtor - special method called when instantiating a new Statistics object
	
	public Statistics(double[] values) {
		for(int i=0;i<values.length;i++) {
			double v = values[i];
			if(v<min)min =v;
			if(v>max)max = v;
			sum+=v;
			nSamples++;
		}
	}
	/**
	 * @param nSamples
	 * @param min
	 * @param max
	 * @param sum
	 */
	public Statistics() {
		this.nSamples = 0;
		this.min = 0;
		this.max = 0;
		this.sum = 0;
	}
	//Star
//In oop contsrutcote is a special method ewhen 
	//Related to polymorphism
	//Example.. creating studen calss in java and 
	//Reasons why it is important
	//In OOP questions answer by sneek in the 4 pillars 
}
