package com.appinmotion.alg.problems;

import java.util.Random;

import com.appinmotion.alg.Utils;

public class LongestIncreasingSequence {

	public static void go() {
		int[] n = new int[20];
		Random r = new Random();
		for (int i = 0; i < n.length; i++) {
			n[i] = r.nextInt(100);
		}
		Utils.print1d(n);
		goN2(n);
	}

	private static void goN2(int[] n) {
		int[] m = new int[n.length];
		for (int i = 0; i < n.length; i++) {
			for (int j = i - 1; j >= 0; j--) {
				if (n[i] > n[j] && m[i] < m[j] + 1) {
					m[i] = m[j] + 1;
				}
			}
		}
		
		Utils.print1d(m);
	}

	private static void goNLogN() {

	}
}
