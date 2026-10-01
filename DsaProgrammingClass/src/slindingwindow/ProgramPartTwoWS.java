package slindingwindow;

public class ProgramPartTwoWS {
	public static void main(String[] args) {
		int [] arr = {4,7,2,5,1,6,6};
		int k = 3;
		int sum = 0;
		for(int i = 0; i<k; i++) {
			sum += arr[i];
			System.out.println(sum);
		}
		
		
		System.out.println("------------------");
		
		for(int i = k; i<arr.length; i++) {
			sum += arr[i];
			sum -= arr[i - k];
			System.out.println(sum);
		}
	}

}
