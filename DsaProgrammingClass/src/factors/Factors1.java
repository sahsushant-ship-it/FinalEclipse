package factors;

public class Factors1 {
	public static void main(String[] args) {
//		time complexisity is O(n)
		int n= 24;
		for(int i =1;i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}
	}
	

}
