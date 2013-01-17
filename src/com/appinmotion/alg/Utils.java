package com.appinmotion.alg;

import java.util.Random;

public class Utils {

	public static void print1d(int[] n) {
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i] + " ");
			if (n[i] < 10) {
				System.out.print(" ");
			}
		}
		System.out.print("\n");
	}
	
	public static void print2d(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("");
	}
	
	public static int[] gen1d(int size) {
		int[] n = new int[size];
		Random r = new Random();
		for (int i = 0; i < size; i++) {
			n[i] = r.nextInt(100);
		}
		return n;
	}
}
