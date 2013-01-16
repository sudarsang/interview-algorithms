package com.example.poc;

import java.util.ArrayList;
import java.util.List;

/*
 * 
 |_|
 |_| |_|
 |_| |_| |_|
 |_| |_| |_| |_|
 |_| |_| |_| |_| |_|

 Each cup has capacity C and once a cup gets full, it drops half extra amount to left child and half extra amount to right child

 for Eg : let' first cups get 2C amount of liquid then extra amount C(2C-C) will be divided equally to left and right child cup of next level

 i.e. C/2 to left child and C/2 to right child

 Write a function which takes input parameter as amount of liquid poured at top (L) and height of particular cup (h) index of that cup (i) and it should return amount of liquid absorbed in that cup.

 - NaiveCoder on February 24, 2012 in India | Report Duplicate 
 */
public class Pouring {

	public static final double C = 10;

	public static void go() {
		simulate(300);
	}

	public static void simulate(double value) {
		List<Double> list = new ArrayList<Double>();
		list.add(value);
		int line = 2;
		boolean has10 = true;
		System.out.println(value);
		while (has10) {
			// for each line , do:
			// adding new line
			has10 = false;
			int startIndex = (line - 1) * line / 2;
			for (int i = 0; i < line; i++) {
				double tempValue = 0;
				if (i < line-1) {
					// right parent
					if (list.get(startIndex + i - line + 1) > C) {
						tempValue += (list.get(startIndex + i - line + 1) - C) / 2;
					}
				}
				if (i > 0) {
					// left parent
					if(list.get(startIndex + i - line) > C){
						tempValue += (list.get(startIndex + i - line) - C) / 2;
					}
				}
				if (tempValue > C) {
					has10 = true;
				}
				list.add(tempValue);
				System.out.format("%.0f ", tempValue);
			}
			System.out.println(" ");
			line++;
		}

	}
}
