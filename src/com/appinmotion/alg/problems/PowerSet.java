package com.appinmotion.alg.problems;

public class PowerSet {
	public static int mCounter;
	public static String mStr = "123456";

	public static void go() {
		mCounter=0;
		getCombination("", 0);
		System.out.println(mCounter);
	}

	public static void getCombination(String used, int unusedIndex) {
		mCounter++;
		//System.out.println(used);		
		if(unusedIndex == mStr.length()){
			return;
		}
		for (int i = unusedIndex; i < mStr.length(); i++) {
			getCombination(used + mStr.charAt(i), i + 1);
		}
	}
}
