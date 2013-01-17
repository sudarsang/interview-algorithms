package com.appinmotion.alg.problems;

import java.util.Random;

import com.appinmotion.alg.Utils;

/*
 * rotate a 2d matrix in place
 
 *
 */
public class RotateMatrix {

	public static void go() {
		int[][] a = new int[5][5];
		Random r = new Random();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				a[i][j] = r.nextInt(9);
			}
		}
		Utils.print2d(a);
		solve(a);
		Utils.print2d(a);
	}

	public static void solve(int[][] m) {
		int side = m.length;
		int temp = 0;
		for (int i = 0; i < side / 2; i++) {
			for (int j = i; j < side-1 - i; j++) {
				temp = m[i][j];
				m[i][j] = m[side - 1 - j][i];
				m[side - 1 - j][i] = m[side - 1 - i][side - 1 - j];
				m[side - 1 - i][side - 1 - j] = m[j][side - 1 - i];
				m[j][side - 1 - i] = temp;
			}
		}
	}

	
}
