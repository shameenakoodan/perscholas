package introtojavabasics;


public class UnaryOperators {

	public static void main(String[] args) {
		// Unary operators
		int a=20,b=10,c=0,d=20,e=40,f=30;
		int result = -a;
		System.out.println(a + " is changed to " + result);
		result = +a;
		System.out.println(-result + " is changed to " + result);
		
		//Postfix increment
		c = b++;
		System.out.println("Value of c (b++) = " + c);
		//Value of c(b++) = 10
		System.out.println("Value of b = " + b);
		
		//Prefix increment
		c=++a;
		System.out.println("Value of c (++a) = "+ c);
		System.out.println("Value of a = "+a);
		
		//Postfix Decrement operator
		c = e--; 
		System.out.println("Value of c (e--) = " + c); 
		//Value of c (e--) = 40
		System.out.println("Value of e = " + e); 
		
		//Prefix decrement operator
		c = --d; 
		System.out.println("Value of c (--d) = " + c);
		//Value of c (--d) = 19
		System.out.println("Value of d = " +d);
		
		//Logical Not Operator
		
	}

}