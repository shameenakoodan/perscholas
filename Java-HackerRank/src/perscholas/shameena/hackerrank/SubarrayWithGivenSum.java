/**
 * 
 */
package perscholas.shameena.hackerrank;
import java.util.ArrayList;
import java.util.stream.IntStream;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/**
 * @author homeoffice
 *
 */
public class SubarrayWithGivenSum {

	/**
	 * @param args
	 */
	/*
	 * Initialize a hashmap to store the frequency of the sum values obtained so
	 * far, and a variable count to keep track of the number of subarrays with a sum
	 * equal to k. Initialize a variable sum to 0. Traverse through the array and
	 * for each element: Update the value of sum by adding the current element. If
	 * sum equals k, increment count by 1. If the value sum - k is present in the
	 * hashmap, increment count by the frequency of sum - k in the hashmap.
	 * Increment the frequency of the current value of sum in the hashmap. Return
	 * count, which represents the number of subarrays with a sum equal to k.
	 */
	public static void main(String[] args) {
		List<Integer> aList = Arrays.asList(1,2,3,1,5);
		System.out.println(countNumberOfSubarrays(aList, 6));
	}
	public static long countNumberOfSubarrays(List<Integer> arr, int k) {
        long count=0;
        int sum =0;
        HashMap<Integer, Integer> hashMap =  new HashMap<>();
        for(int i=0;i<arr.size();i++) {
        	sum+=arr.get(i);
        	if(sum==k) {
        		count++;
        	}
        	if(hashMap.containsKey(sum-k)){
        		count+=hashMap.get(sum-k);
        	}
			hashMap.put(sum, hashMap.getOrDefault(sum,0)+1);

        }
        return count;
    }
}
