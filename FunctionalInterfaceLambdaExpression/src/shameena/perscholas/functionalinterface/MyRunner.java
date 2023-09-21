/**
 * 
 */
package shameena.perscholas.functionalinterface;

/**
 * @author homeoffice
 *
 */
public class MyRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		NormalClass mObj = new NormalClass();
	       mObj.hObjone.say();
	       mObj.hObjTwo.say();
	       
	       mObj.hObjone.sleep();
	       mObj.hObjTwo.sleep();
	       //Technically an interfsce is static class
	       //So we can access a static method with interfaceNsame.staticmethod()
	       Human.communication();
	}

}
