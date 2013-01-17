package com.appinmotion.alg.problems;

import com.appinmotion.alg.Utils;

public class RestoreSeqFromIncDesc {
	/*
	 * You are given an array of n elements [1,2,....n]. For example
	 * {3,2,1,6,7,4,5}. Now we create a signature of this array by comparing
	 * every consecutive pir of elements. If they increase, write I else write
	 * D. For example for the above array, the signature would be "DDIIDI". The
	 * signature thus has a length of N-1. Now the question is given a
	 * signature, compute the lexicographically smallest permutation of
	 * [1,2,....n]. Write the below function in language of your choice. vector*
	 * FindPermute(const string& signature);
	 */

	public static void go() {
		Utils.print1d(check("DDIIDI"));
	}

	public static int[] check(String s) {
		int index = 1;
		int[] result = new int[s.length() + 1];
		for (int i = 0; i < s.length() + 1; i++) {
			if (i == s.length() || s.charAt(i) == 'I') {
				for (int j = i; j >= 0 && result[j] == 0; j--) {
					result[j] = index++;
				}
			}
		}
		return result;
	}
}
