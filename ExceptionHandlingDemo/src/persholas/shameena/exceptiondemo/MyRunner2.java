/**
 * 
 */
package persholas.shameena.exceptiondemo;

/**
 * @author homeoffice
 *
 */
public class MyRunner2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
	           //this try block calls the above method so handle the exception
	           Example_Throw obj=new Example_Throw();
	           obj.testMethod(1);
	       }catch(Exception ex){
	           System.out.println(ex);
	       }

	}

}
