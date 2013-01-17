package com.appinmotion.alg.problems;

import com.appinmotion.alg.AlgUtils;
import com.appinmotion.alg.Utils;

/*
 Given a sorted array of n integers, pick up k elements so that the minimal difference between consecutive elements is maximal (that is choose the elements to maximize the quantity min(a[i+1] - a[i]))
 */
public class MaxMinInc {

	public static void go() {
		int[] n = Utils.gen1d(10);
		AlgUtils.quickSort(n);
		Utils.print1d(n);
	}

	public static void solve(int[] n, int k) {
		int[][] d = new int[n.length][k];
	}
}
