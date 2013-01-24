package com.appinmotion.alg.java;

public class WrapperClass {

	public static void go() {
		Integer i = 10;
		solve(i);
		System.out.print(i);
	}

	public static void solve(Integer i) {
		i = i + 1;
	}
}
