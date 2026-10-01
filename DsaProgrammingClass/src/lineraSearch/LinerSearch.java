package lineraSearch;

public class LinerSearch {
//	time complexisity is O(n)
	public static int get_index(int[] arr, int key) {
		int ind = -1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				ind=i;
			}
		}
		return ind;
	}
	public static void main(String[] args) {
		int[]arr= {1,2,5,4,6,9,8,7,11,13,15};
		int key=15;
		System.out.println(get_index(arr,key));
	}

}
