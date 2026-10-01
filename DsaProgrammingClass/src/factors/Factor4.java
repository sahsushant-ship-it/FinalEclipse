package factors;

public class Factor4 {
//	TC is O(root n)
	public static void main(String[] args) {
		int n = 24;
		for(int i=(int)Math.sqrt(n);i>=1;i--) {
			if(n%i==0 && i!=n/i) {
				System.out.println(n/i);
			}
		}
		
		
	}

}
