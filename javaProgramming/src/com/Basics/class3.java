package com.Basics;

public class class3 {
	public static void main(String[] args) {
		/*
		 * int a = 20; int b = 28; int c = 51;
		 * 
		 * if (a < b && a < c) { System.out.println(a); } else if (b < a && b < c) {
		 * System.out.println(b); } else { System.out.println(c); }
		 */

		/*
		 * int a = 20; int b = 28; int c = 51;
		 * 
		 * if (a > b) { if (a > c) { System.out.println(a); } else {
		 * System.out.println(c); } } else { if (b > c) { System.out.println(b); } else
		 * { System.out.println(c); } }
		 */
          //using ternary operator;
		int a = 20;
		int b = 28;
		int c = 51;

		int res = (a > b) ? (a > b) ? a : c : (b > c) ? b : c;
		System.out.println(res);

	}

}

 
 
 