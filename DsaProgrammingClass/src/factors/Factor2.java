package factors;

public class Factor2 {
//	time complexisity is O(n/2)
	public static void main(String[] args) {
		int n = 24;
		for(int i = 1; i<=n/2 ; i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}
		System.out.println(n);
	}

}
