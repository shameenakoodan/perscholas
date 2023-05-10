package perscholas.shameena.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> aIntegers = new ArrayList<>(Arrays.asList(1, 2, 7,7));
		List<Integer> bIntegers = new ArrayList<>(Arrays.asList(3,4,5,5,6,7));
		List<Integer> resIntegers = mergeArrays(aIntegers,bIntegers);
		System.out.println(resIntegers);
	}
	public static List<Integer> mergeArrays(List<Integer> a, List<Integer> b) {
	    List<Integer> array = new ArrayList<>();
	    for (Integer aElement : a) {
            for(Integer bElement:b) {
            	if(bElement<aElement) {
            		array.add(bElement);
            	}
            	else if(aElement == bElement)
            	{
            		array.add(bElement);
            		array.add(aElement);
            	}else {
            		array.add(aElement);
				}
            }
            //array.add(aElement);
        }
	    return array;

	    }
}
