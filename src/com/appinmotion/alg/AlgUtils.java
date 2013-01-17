package com.appinmotion.alg;

import java.util.Random;

public class AlgUtils {

	public static void quickSort(int[] n) {
		quickSort(n, 0, n.length - 1);
	}

	private static void quickSort(int[] n, int i, int j) {
		int pivotIndex = j;
		for (int k = j; k > i; k--) {
			if (n[k] > n[i]) {
				swap(n, k, pivotIndex);
				pivotIndex--;
			}
		}
		swap(n, i, pivotIndex);
		if (pivotIndex - 1 > i) {
			quickSort(n, i, pivotIndex - 1);
		}
		if (pivotIndex + 1 < j) {
			quickSort(n, pivotIndex + 1, j);
		}
	}
	
	public static void swap(int[] n, int i, int j) {
		if (i == j) {
			return;
		}
		n[i] ^= n[j];
		n[j] ^= n[i];
		n[i] ^= n[j];
	}

}
