package shameena.perscholas.functionalinterface;

public class MyRunnerLambda {

	public static void main(String[] args) {
		  // TODO Auto-generated method stub
	      Human HMsg = () -> {
	        System.out.println( "Hello. It’s me again, James");
	      };
	       HMsg.say();

	}

}
