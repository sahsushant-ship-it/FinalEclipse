package lineraSearch;

public class LinearSearchAlgo {
//	time complexisity is O(n)
	 public static int get_index(int[] arr, int key) {
		 for (int i = 0; i<arr.length; i++) {
			 if(arr[i]==key) {
				 return i;
			 }
		 }
		 return -1;
	 }
	 public static void main(String[] args) {
		int[] arr= {1,2,5,8,9,7,6,11};
		int key=11;
		int index=get_index(arr,key);
		System.out.println(index);
	}

}
