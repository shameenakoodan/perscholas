package perscholas.shameena.hackerrank;
import java.util.Arrays;
import java.util.stream.IntStream;
public class subArray {
	// Get subarray of a non-primitive array between specified indices
    public static void main(String[] args)
    {
        String[] arr = { "A", "B", "C", "D", "E", "F", "G", "H" };
        int beg = 1, end = 4;
 
        String[] subarray = IntStream.range(beg, end + 1)
                                .mapToObj(i -> arr[i])
                                .toArray(String[]::new);
 
        System.out.println(Arrays.toString(subarray));
    }
}