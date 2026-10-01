package os;

import java.util.Scanner;

public class count {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("enter n value :");
	int n=s.nextInt();
	System.out.println("enter array elements:");
	int a[]=new int [n];
	for(int i = 0;i<n;i++) {
		a[i]=s.nextInt();
		
	}
for(int i =0;i<n;i++) {
	if(a[i]%2==0) {
		System.out.println("the number "+a[i]+" is even");
	}
	else {
		System.out.println("the number "+a[i]+" is odd");
	}
}
	
}
}

