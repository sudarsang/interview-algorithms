package com.appinmotion.alg.experiment;

public class BitOperation {

	public static void go() {
		int a = 123;
		
		int b= 421;
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.print(a + " " + b);
	}

	public static void flip(int n) {
		System.out.print(~n + "");
	}

	public static void reverse(int n) {

	}
}
