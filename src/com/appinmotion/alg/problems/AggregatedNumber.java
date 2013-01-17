package com.appinmotion.alg.problems;

import com.appinmotion.alg.MathUtils;

public class AggregatedNumber {
	/*
	 * we will name a number "aggregated number" if this number has the
	 * following attribute: just like the Fibonacci numbers 1,1,2,3,5,8,13.....
	 * the digits in the number can divided into several parts, and the later
	 * part is the sum of the former parts. like 112358, because 1+1=2, 1+2=3,
	 * 2+3=5, 3+5=8 122436, because 12+24=36 1299111210, because 12+99=111,
	 * 99+111=210 112112224, because 112+112=224 so can you provide a function
	 * to check whether this number is aggregated number or not?
	 */

	public static void go() {
		check(123581322);
	}

	public static boolean check(int n) {
		int l = MathUtils.getDigits10(n);
		for (int i = 0; i < (double) l / 2 - 1; i++) {
			for (int j = i + 1; j < l && l - j > i + 1 && l - j > (j - i); j++) {
				int n1 = getNumber(n, l, 0, i);
				int n2 = getNumber(n, l, i, j);
				System.out.println("[" + i + "] " + getNumber(n, l, 0, i) + " "
						+ getNumber(n, l, i, j));

				int ll = MathUtils.getDigits10(n1 + n2);
				int p = j;
				while (ll + p <= l) {
					ll = MathUtils.getDigits10(n1 + n2);
					int nextInt = getNumber(n, l, p, p + ll);
					if (n1 + n2 == nextInt) {
						System.out.println((n1 + n2) + " match with "
								+ nextInt );
						n1 = n2;
						n2 = nextInt;
						p += ll;
						if (p == l-1) {
							System.out.println(" match! ");
							return true;
						}
					} else {
						System.out.println((n1 + n2) + " mismatch with "
								+ nextInt);
						break;
					}
				}
			}
		}
		return false;
	}

	public static int getNumber(int n, int l, int i, int j) {
		int n1Digits = (int) Math.pow(10, (l - i - 1));
		int n1 = n / n1Digits;
		if (i == j) {
			return n1;
		} else {
			return (n - n1 * n1Digits) / (int) Math.pow(10, (l - j - 1));
		}
	}
}
