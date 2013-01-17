package com.appinmotion.alg.experiment;

import java.util.Random;

public class TossCoin {

	public static void go() {
		double sum = 0;
		int size = 100000;
		for (int i = 0; i < size; i++) {
			sum += get1();
		}
		System.out.println(sum / size);
	}

	public static int get1() {
		Random r = new Random();
		int x = r.nextInt(8);
		if (x != 1) {
			return 1;
		} else {
			return get1() + 1;
		}
	}
}
