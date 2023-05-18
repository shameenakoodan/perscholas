package perscholas.shameena.genericsExample;

import java.math.BigDecimal;

public class MyRunner4 {
	public static void main(String[] args) {
	       // initialize generic class with Integer value
	       MathBox<Integer> mObj = new MathBox<Integer>(5);
	        // initialize generic class with double value
	       MathBox<Double> mObj2 =  new MathBox<Double>(32.1);

	       System.out.println(mObj.sqrt());
	       System.out.println(mObj2.sqrt());
	      //  MathBox mObj3 =  new MathBox<Double>(" Perscholas"); // error
	   }
}
