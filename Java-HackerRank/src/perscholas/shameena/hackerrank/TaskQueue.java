package perscholas.shameena.hackerrank;

import java.util.Arrays;
import java.util.List;

public class TaskQueue {

	public static void main(String[] args) {
		int n = 2;
		List<Integer> batchSize = Arrays.asList(3,2,5,7);
		List<Integer> processingTime = Arrays.asList(5,4,10,12);
		List<Integer> numTasks = Arrays.asList(10,6,10,5);
		System.out.println(minTime(batchSize, processingTime, numTasks));

	}
	public static long minTime(List<Integer> batchSize, List<Integer> processingTime, List<Integer> numTasks) {
		long max = 0;
		/*for(int i=0;i<batchSize.size();i++) {
			int result = 0;
			for(int j=0;j<numTasks.get(i);j=j+batchSize.get(i)) {
				result+=processingTime.get(i);
			}
			if(max<result)
				max = result;
		}*/
		for(int i=0;i<batchSize.size();i++) {
			int result =  numTasks.get(i)/batchSize.get(i);
			long interResult;
			if(numTasks.get(i)%batchSize.get(i) >0) {
				interResult = processingTime.get(i) * result + processingTime.get(i);
			}
			else {
				interResult = processingTime.get(i) * result;

			}
			if(max < interResult)
				max = interResult; 
		}
		return max;
		}
	}



