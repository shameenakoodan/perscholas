import java.util.Scanner;

import javax.swing.LayoutFocusTraversalPolicy;

public class Flora {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number for x");
		int x = input.nextInt();

		System.out.print("Enter number for y");
		int y = input.nextInt();
		int i;
		int gcd = -1;
		for (i = 2; i < x && i < y; i++) {

			if (x % i == 00 && y % i == 00) 
				gcd = i;
		}
		System.out.println(gcd);
	}

}