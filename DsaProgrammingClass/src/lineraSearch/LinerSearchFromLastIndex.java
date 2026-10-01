package lineraSearch;

public class LinerSearchFromLastIndex {
	public static int get_index(int[] arr, int key) {
		for(int i = arr.length-1; i >=0;i--) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr= {10,20,50,60,40,20,20,20,60,30,40,20,100,120};
		int key= 40;
		System.out.println(get_index(arr,key));
	}

}
