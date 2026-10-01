package hcf;

public class HCF {
//	time complexisity = O(min(a,b))
	public static int find_hcf(int a , int b) {
		int hcf=0;
		for(int i =1;i<=Math.min(a, b); i++) {
			if(a%i==0 && b%i==0) {
				hcf=i;
			}
		}
		return hcf;
	}
	public static void main(String[] args) {
		int a = 12;
		int b = 18;
		System.out.println(find_hcf(a,b));
	}
}
