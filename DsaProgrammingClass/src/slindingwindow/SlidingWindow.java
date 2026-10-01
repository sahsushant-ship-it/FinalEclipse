package slindingwindow;

public class SlidingWindow {
	public static void main(String[] args) {
		int[] arr = {4,7,2,5,1,6,6};
		int k = 3;
		for(int i = 0; i<=arr.length-k; i++) {
			int sum = 0;
			for(int j = i; j<i+k; j++) {
				sum += arr[j];
			}
			System.out.println(sum);
		}
		
	}
	

}
