/**
 * 
 */
package perscholas.shameena.hackerrank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @author homeoffice
 *
 */
public class SubarrayWithGivenSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> aList = Arrays.asList(10,2,-2,-20,10,-10);
		System.out.println(countNumberOfSubarrays(aList, 2));
	}
	public static long countNumberOfSubarrays(List<Integer> arr, int k) {
	        long count =0;
	        int n=arr.size();
	        for(int i=0;i<n;i++){
	        	for(int j=i;j<n;j++) {
	        		int sum = 0;
	        		for(int m = i;m<=j;m++) {
	        			sum+=arr.get(m);
	        		}
	        		if(sum == k)
		        		count++;
	        	}
	        	
	        	
	        }
	        return count;
    }
}
