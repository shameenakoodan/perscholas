package perscholas.shameena.genericsExample;

public class MyRunner3 {
	   public static void main(String[] args) {
	    ElephantItem<Integer> ObjMove = new ElephantItem<>();
	    ObjMove.move(5, "NYC");
	    System.out.println( ObjMove.getItemBeingMoved()   + " Item");
	    System.out.println(ObjMove.getLocationBeingMovedTo()  +" Location");
	   }
	}
