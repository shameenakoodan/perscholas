package perscholas.shameena.genericsExample;

public class MyRunner2 {
	 public static void main(String[] args) {
	       // initialize generic class
	       // with Integer data
	       GenericsClass<Integer> intObj = new GenericsClass<>(5);
	       System.out.println("Generic Class returns: " + intObj.getData());

	       // initialize generic classa again
	       // with String data
	       GenericsClass<String> stringObj = new GenericsClass<>("Java");
	       System.out.println("Generic Class returns: " + stringObj.getData());
	   }

}
