package hcf;

public class MeuclidHcf {
//	time complexisty of meuclid is O(max(a,b))
	public static int meuclid_hcf(int a , int b) {
		while(a!=0 && b!=0) {
			if(a>b) {
				a=a%b;
			} else {
				b=b%a;
			}
		}
		if(a!=0) {
			return a;
		}
		return b;
	}
	public static void main(String[] args) {
		int a = 26;
		int b = 36;
		System.out.println(meuclid_hcf(a,b));
	}

}

