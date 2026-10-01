package hcf;

public class EuclidHcf {
//	time complexisity of eculid is O(max(a,b))
	public static int eculid_hcf(int a , int b) {
		while (a!=b) {
			if(a>b) {
				a=a-b;
			} else {
				b=b-a;
			}
		}
		return b;
	}
	public static void main(String[] args) {
		int a = 12;
		int b = 18;
		System.out.println(eculid_hcf(a,b));
	}

}
