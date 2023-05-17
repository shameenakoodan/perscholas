package introtojavabasics;

import java.util.Arrays;

public class ArrayRandomValues {

	public static void main(String[] args) {
		double[] arr = new double[5];
		for (int i = 0; i < 5; i++) {
			//Max -Min + 1 + min
			arr[i] = (int)(Math.random()*11);
		}
		System.out.println("Random numbers = " + Arrays.toString(arr));

	}
}