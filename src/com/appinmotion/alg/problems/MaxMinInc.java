package com.appinmotion.alg.problems;

import java.util.Random;

/*
 Given a sorted array of n integers, pick up k elements so that the minimal difference between consecutive elements is maximal (that is choose the elements to maximize the quantity min(a[i+1] - a[i]))
 */
public class MaxMinInc {

	public static void go() {
		int size = 20;
		int[] n = new int[size];
		Random r = new Random();
		for(int i=0; i<size; i++){
			n[i] = r.nextInt();
		}
	}
}
