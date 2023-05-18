package perscholas.shameena.genericsExample;

public class MyRunner {
	public static void main(String[] args) {
		//An object of type generic method example class
	       System.out.println( "===invoking regular method========" );
	       GenericMethodExample obj = new GenericMethodExample();
	       obj.printValues(43); //type Integer
	       obj.printValues("Programmer");//type String
	       obj.printValues(54.43);//type Double
	       obj.printValues(true); // type Boo

	       System.out.println( "===invoking static method========" );
	       GenericMethodExample.staticdisplayData(254);
	       GenericMethodExample.staticdisplayData("Java Developer");
	       GenericMethodExample.staticdisplayData(254.25);

	       Integer[] intArray = { 10, 20, 30, 40, 50 };
	       Character[] charArray = { 'J', 'A', 'V', 'A'};
	       System.out.println( "Printing Integer Array" );
	       GenericMethodExample.printArray( intArray  );
	       System.out.println( "Printing Character Array" );
	       GenericMethodExample. printArray( charArray );
	   }


}
