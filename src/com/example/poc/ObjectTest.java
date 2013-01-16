package com.example.poc;

public class ObjectTest {

	public static void go() {
		Data d = new Data(1);
		update(d);
		System.out.println(d.value);
	}

	public static void update(Data d) {
		d = new Data(10);
		System.out.println(d.value);
	}

	
}

class Data {
	public Data(int v) {
		value = v;
	}
	public int value;
}