package prime;

public class PrimeNum {
//	TC is O(root N)
	public static boolean check_primeop(int n) {
		boolean is_prime = true;
		if(n<=1) {
			return false;
		}
		for(int i = 2; i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				is_prime=false;
			}
		}
		return is_prime;
	}
	public static void main(String[] args) {
		int n = 31;
		System.out.println(check_primeop(n));
	}

}
