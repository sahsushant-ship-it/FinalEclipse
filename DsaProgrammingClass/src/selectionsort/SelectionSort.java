package selectionsort;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = {10,20,30,2,8,50,60,70,9,1,23,33,44,40,90};
		for(int i = 0; i<arr.length;i++) {
			int min_index=i;
			for(int j = i+1; j<arr.length;j++) {
				if(arr[j]<arr[min_index]) {
					min_index=j;
				}
			}
			int temp=arr[i];
			arr[i]= arr[min_index];
			arr[min_index]= temp;
		}
		System.out.println(Arrays.toString(arr));
	}

}
