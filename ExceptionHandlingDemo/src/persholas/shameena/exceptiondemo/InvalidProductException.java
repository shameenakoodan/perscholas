package persholas.shameena.exceptiondemo;

public class InvalidProductException  extends Exception
{
	public InvalidProductException(String s)
	   {
	       // Call constructor of parent Exception
	       super(s);
	   }
}
