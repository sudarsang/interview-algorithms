package com.appinmotion.alg;

public class MathUtils {

	public static int factorial(int n) {
		int fact = 1; // this will be the result
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}

	/**
	 * get d-th digit of n
	 * 
	 * @param n
	 * @param digit
	 * @return
	 */
	public static int getDigit(int n, int d) {
		int mask1 = (int) Math.pow(10, d);
		if (n < mask1) {
			return -1;
		} else {
			int mask2 = (int) Math.pow(10, d + 1);
			return n / mask1 - n / mask2 * 10;
		}

	}

	/**
	 * get how many digits the int has
	 * 
	 * @param n
	 * @return
	 */
	public static int getDigits10(int n) {
		return (int) Math.log10(n) + 1;
	}
}
