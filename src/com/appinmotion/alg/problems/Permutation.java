package com.appinmotion.alg.problems;

import com.appinmotion.alg.MathUtils;

/**
 * get all permutation of a string
 * 
 * @author Xi
 * 
 */
public class Permutation {

	public static int counter;

	public static void go() {
		counter = 0;
		String s = "12345";
		getPermutation("", s);
		// compare the result counter to see if the permutation is generated
		// correctly
		System.out.println(counter + " " + MathUtils.factorial(s.length()));
	}

	public static void getPermutation(String used, String unused) {
		if (unused.length() == 0) {
			// we reached a leaf of the search tree
			counter++;
			// System.out.println(used);
			return;
		}
		for (int i = 0; i < unused.length(); i++) {
			getPermutation(used + unused.charAt(i), unused.substring(0, i)
					+ unused.substring(i + 1));
		}
	}
}
