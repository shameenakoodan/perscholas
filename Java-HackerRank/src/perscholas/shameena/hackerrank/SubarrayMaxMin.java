package perscholas.shameena.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SubarrayMaxMin {

	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(2,5,4,6,8);
		System.out.println(maxMin(arr, 3));

	}
    public static int maxMin(List<Integer> arr, int k) {
    	int n = arr.size();
        // initialize sum as 0
        int sum = 0;
        // Traverse all the subarray of size k one by one
        for (int i = 0; i <= n - k; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = i; j < i + k; j++) {
                min = Math.min(min, arr.get(j));
            }
        }
        return sum;
    }

}	
/*
index 0
[2, 5, 4]
index 1
[5, 4, 6]
index 2
[4, 6, 8]*/