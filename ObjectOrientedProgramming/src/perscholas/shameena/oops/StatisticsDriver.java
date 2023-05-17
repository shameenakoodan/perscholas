package perscholas.shameena.oops;

public class StatisticsDriver {
	public static void main(String args[]) {
		double[] values = new double[100];
		for(int i=0;i<100;i++) {
			values[i] = Math.random()*100;
		}
		//Create our statistics object
		//We have also instantiated our statistics objetc
		//We have created an instance of type Statistics
		//We have creted an object of type statistics
		//statistics is a variable of type statistics
		
		
		Statistics statistics = new Statistics(values);
		
	}
}
