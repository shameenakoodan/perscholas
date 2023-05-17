package perscholas.shameena.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComplianceCrawler {

	public static void main(String[] args) {
		List<String> loggedMoves =Arrays.asList("x/","y/","../","z/","./");
		System.out.println(minimumSteps(loggedMoves));

	}
	public static int minimumSteps(List<String> loggedMoves) {
		int min = 0;
		for(String str:loggedMoves) {
			if(str.equals("./") ){
				continue;
				
			}
			else if(str.equals("../"))
				min-=1;
			else {
				min++;
			}
		}
		return min;
	}
}
