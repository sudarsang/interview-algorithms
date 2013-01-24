package com.appinmotion.alg.problems;

import com.appinmotion.alg.Utils;

public class IncSeqNum {
	/*
	 * Given an array of integers, find out number of ways in which you can select increasing subsequences of length k(k<=n).
	 * 
	 * for eg array is 1 4 6 2 5 & k=3 then the answer is :- 1 4 5, 1 2 5,1 4 6, 1 2 6, so ways are 5 he first made me to write a recurrence then asked me to memoize that
	 */
	public static void go() {
		int[] n = {1, 4, 6, 2, 5};
		int[] r = new int[3];
		for (int i = 0; i < n.length; i++) {
			r[0] = n[i];
			solve(n, i, 1, r);
		}
	}
	public static void solve(int[] n, int start, int k, int[] result) {
		for (int i = start; i < n.length; i++) {
			if (n[i] > result[k - 1]) {
				result[k] = n[i];
				if (k == 2) {
					Utils.print1d(result);
				} else {
					solve(n, i + 1, k + 1, result);
				}
			}
		}
		return;
	}
}
