package perscholas.shameena.genericsExample;

public class GenericMethodExample {
	   
	   public <T> void printValues(T value) {
	       System.out.println("Value : " + value);
	   }

	   public static <T> void staticdisplayData(T value)
	   {
	       System.out.println(value);
	   }

	   public static <E> void printArray(E[] elements)
	   {
	       for ( E element : elements){
	           System.out.println(element );
	       }
	       System.out.println();
	   }
	}
