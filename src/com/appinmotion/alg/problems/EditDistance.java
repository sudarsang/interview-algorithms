package com.appinmotion.alg.problems;

import com.appinmotion.alg.Utils;

public class EditDistance {

	public static void go() {
		String s1 = "eeeeeasdf";
		String s2 = "asdf";
		getDistance(s1, s2);
	}

	public static void getDistance(String s1, String s2) {
		int[][] dis = new int[s1.length() + 1][s2.length() + 1];

		for (int i = 0; i < s1.length() + 1; i++) {
			dis[i][0] = i;
		}

		for (int j = 1; j < s2.length() + 1; j++) {
			dis[0][j] = j;
		}

		for (int i = 1; i < s1.length() + 1; i++) {
			for (int j = 1; j < s2.length() + 1; j++) {
				int v1 = dis[i - 1][j - 1] + (s1.charAt(i-1) == s2.charAt(j-1) ? 0 : 1);
				int v2 = dis[i - 1][j] + 1;
				int v3 = dis[i][j - 1] + 1;
				dis[i][j] = Math.min(v1, Math.min(v2, v3));
			}
		}

		Utils.print2d(dis);
	}
}
