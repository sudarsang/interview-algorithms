package com.appinmotion.alg.problems;

import com.appinmotion.alg.Utils;

public class MinimumPalindrome {
	/*
	 * You are given a large string. You need to cut the string into chunks such that each substring that you get is a palindrome. Remember that each 1 length string is always a palindrome. You need to find the minimum number of cuts that you need to make such that each substring is a palindrome.
	 */
	public static int counter;
	public static void go() {
		String s = "abcbdbcac";

		solve(s);
	}
	public static void solve(String s) {
		int[][] p = new int[s.length()][s.length()];
		int[][] min = new int[s.length()][s.length()];
		countPalindrome(s, p);
		Utils.print2d(p);
		counter = 0;
		calculateMin(p, min, 0, s.length() - 1);
		Utils.print2d(min);
		System.out.println(counter);
		

	}

	public static int calculateMin(int[][] p, int[][] min, int j1, int j2) {
		counter++;
		if (min[j1][j2] > 0) {
			return min[j1][j2];
		} else if (p[j1][j2] == 1) {
			min[j1][j2] = 1;
			return 1;
		} else {
			int minV = Integer.MAX_VALUE;
			for (int i = j1; i < j2; i++) {
				int v = calculateMin(p, min, j1, i) + calculateMin(p, min, i + 1, j2);
				if (minV > v) {
					minV = v;
				}
			}

			min[j1][j2] = minV;
			return minV;
		}
	}

	public static void countPalindrome(String s, int[][] p) {
		for (int i = 0; i < p.length * 2 - 1; i++) {
			int j1, j2;
			if (i % 2 == 0) {
				j1 = i / 2 - 1;
				j2 = i / 2 + 1;
			} else {
				j1 = i / 2;
				j2 = i / 2 + 1;
			}
			if (i < p.length) {
				p[i][i] = 1;
			}
			while (j1 >= 0 && j2 < p.length) {
				if (s.charAt(j1) == s.charAt(j2)) {
					p[j1][j2] = 1;
				} else {
					p[j1][j2] = 0;
					break;
				}
				j1--;
				j2++;
			}
		}

	}
}
