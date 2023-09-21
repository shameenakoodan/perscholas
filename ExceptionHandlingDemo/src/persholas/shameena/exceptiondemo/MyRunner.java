package persholas.shameena.exceptiondemo;

public class MyRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int d = 0;
			int n = 5;
			// code that generates exception
			int divideByZero = n / d;
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException occur  => " + e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("This is the finally block");
			
		}

		try {
	        String[] st = {"A","B","C","D","E"};
	        st[11] = "X";
	     }
	     catch(ArrayIndexOutOfBoundsException e){

	       System.out.println("index position is not exist --> " + e.getMessage());
	       // e.printStackTrace();
	       }
	       finally {
	           System.out.println("This is the finally block");
	       }

	}

}
