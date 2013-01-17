package com.appinmotion.alg.java;

public class StringTest {

	public static void go(){
		String original = "unchanged";
		String another =  "unchanged";
		System.out.println(original);
		updateString(original );
		System.out.println(original);
		System.out.println(original == another);
	}
	
	public static void updateString(String str){
		str = "changed";
		System.out.println(str);
	}
}
