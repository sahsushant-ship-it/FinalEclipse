package insertionsort;

import java.util.Arrays;

public class InsertionSortPart2 {
	public static void main(String[] args) {
		int[] arr = {10,5,4,7,2,3,6};
		for(int i = 1;i<arr.length;i++) {
			int last = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>last) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=last;
			System.out.println(Arrays.toString(arr));
		}
	
	
	}
	

}
