package perscholas.shameena.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IdenticalDistribution {
	public static int cardPackets(List<Integer> cardTypes) {
        System.out.println(cardTypes);
        ArrayList<Integer> arrayList = new ArrayList<>();
        if(cardTypes.size() == 1)
            return 0;
        int sum = 0;
        for(Integer item:cardTypes){
        	
            if(item%2!=0) {
            	if(arrayList.contains(item+1)) {
            		sum+=3;
            		arrayList.add(item+3);
            	}else {
            		sum+=1;
                    arrayList.add(item+1);
            	}
                
            }
            else {
            	 arrayList.add(item);
			}
        }
        System.out.println(arrayList);
        return sum;
    }
	public static void main(String args[]) {
		List<Integer> numberIntegers = Arrays.asList(5,10,15,20,5);
		System.out.println(cardPackets(numberIntegers));
	}
}
