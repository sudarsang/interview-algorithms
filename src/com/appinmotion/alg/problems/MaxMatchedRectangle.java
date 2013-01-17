package com.appinmotion.alg.problems;

import java.util.Random;

import com.appinmotion.alg.Utils;

/*
 a) There is a square of nxn size which is comprised of n-square 1x1 squares. Some of these 1x1 squares are colored. 
 Find the biggest subsquare which is not colored.
 b) Also asked to extend it to find the biggest area rectangle.
 */
public class MaxMatchedRectangle {

	public static void go() {
		int side = 10;
		int[][] m = new int[side][side];
		Random r = new Random();
		for (int i = 0; i < side; i++) {
			for (int j = 0; j < side; j++) {
				if (r.nextInt(5) > 1) {
					m[i][j] = 1;
				} else {
					m[i][j] = 0;
				}
			}
		}
		Utils.print2d(m);
	}

	public static void solveSquare(int[][] m) {
		
	}
}
