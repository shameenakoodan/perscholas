/**
 * 
 */

/**
 * @author homeoffice
 *
 */
public class MainEntry{

	Calc<Integer> add= new Calc<Integer>() {
		@Override	
		public void compute(int arr[]) {
			int sum =0;
			for(int i=0;i<arr.length;i++) {
				sum+=arr[i];
			}
			System.out.println(sum);
		}
	};
	Calc<Integer> sub= new Calc<Integer>() {
		@Override	
		public void compute(int arr[]) {
			int sub =arr[0];
			for(int i=1;i<arr.length;i++) {
				sub-=arr[i];
			}
			System.out.println(sub);
		}
	};
	Calc<Integer> multiply= new Calc<Integer>() {
		@Override	
		public void compute(int arr[]) {
			int sum =1;
			for(int i=0;i<arr.length;i++) {
				sum*=arr[i];
			}
			System.out.println(sum);
		}
	};
	Calc<Integer> div= new Calc<Integer>() {
		@Override	
		public void compute(int arr[]) {
			double div = arr[0]/arr[1];
			System.out.println(div);
		}
	};
}
