package insertionsort;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = {2,3,4,6,8,9,5};
		int last = arr[arr.length-1];
		int j = arr.length-2;
		while(j>=0 && arr[j]> last) {
			arr[j+1]=arr[j];
			j--;
			System.out.println(Arrays.toString(arr));
		}
		arr[j+1]=last;
		System.out.println(Arrays.toString(arr));
	}
}
 