package patterns;

public class numpatterns {
	public static void main(String[] args) {

		/*
		 * for(int i=1;i<=5;i++) { for(int j=1;j<=i;j++) { System.out.print(j+" ");
		 * 
		 * } System.out.println(); }
		 */
		/*
		 * int n=5; for(int i =1;i<=n;i++) { for(int j=i;j<=n;j++) {
		 * System.out.print("*"+" "); } System.out.println();
		 */
		/*
		 * int k =5; for(int i=1;i<=5;i++) { for(int j=1;j<=5-i;j++){ System.out.print(j
		 * +" ");8 } System.out.println(); }
		 */
/*		int rows = 5;
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= rows - i; j++) {
				System.out.print(" " + " ");
			}
			for (int j = 5; j >= rows + 1 - i; j--) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	*/	
		int rows=5;
		for(int i =1;i<=rows;i++) {
			for(int j=5;j<=rows-1+i;j--) {
				System.out.print(" "+" ");
			}
			for(int j = 5;j>=rows+i-1;j--) {
				System.out.println(j+" ");
			}
		
			
		}

	}
}