/**
 * 
 */
package introtojavabasics;

/**
 * @author homeoffice
 *
 */
public class SwitchEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		int day = 1;
//		switch (day) {
//		  case 1: 
//		  case 2: 
//		  case 3: 
//		  case 4: 
//		  case 5: System.out.println("Weekday"); break;
//		  case 0:  
//		  case 6: System.out.println("Weekend"); 
//		} 
		System.out.println(processArgument("a"));
	}
		public static int processArgument(String arg) {
			int result;
			switch(arg) {
			case "a":result = 1;break;
			case "b":
			case "c":result=2;break;
			case "d":
			case "e":
			case "f":result=3;
			case "g":result = 4;break;
			default:result=-1;
			}
			return result;
		}
	}

