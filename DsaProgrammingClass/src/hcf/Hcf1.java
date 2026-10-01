package hcf;

public class Hcf1 {
//	time complexisity is O(min(a,b))
	public static int find_hfc(int a,int b) {
		for(int i = (int)Math.min(a, b);i>=1;i--) {
			if(a%i==0 && b%i==0) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int a = 22;
		int b = 26;
		System.out.println(find_hfc(a,b));
	}
}
