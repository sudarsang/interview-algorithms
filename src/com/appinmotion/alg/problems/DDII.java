package com.appinmotion.alg.problems;

import com.appinmotion.alg.Utils;



public class DDII {

	public static void go(){
		solve("IDIIIII");
	}
	
	public static void solve(String input) {    
	    int[] result = new int[input.length() + 1];
	    
	    int indexOfSequence = 0;
	    int elementNumber = 1;
	    
	    for (int i = 0; i < input.length(); i++) {
	        if (input.charAt(i) == 'I') {
	            for (int j = i; j >= indexOfSequence; j--) {
	                result[j] = elementNumber;
	                elementNumber++;
	            }
	            indexOfSequence = i + 1;
	        }
	    }
	    
	    for (int j = input.length(); j >= indexOfSequence; j--) {
	        result[j] = elementNumber;
	        elementNumber++;
	    }
	    Utils.print1d(result);
	}
}
