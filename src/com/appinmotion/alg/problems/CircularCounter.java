package com.appinmotion.alg.problems;

public class CircularCounter {

	/* Develop a function which will return either true or false. But at any point of time it should not return more than N number of true (it can be less than N) in last X secs. */
	static final int SIZE = 10;
	int[] n;
	int p;
	int currentTime;

	public CircularCounter() {
		n = new int[SIZE];
		p = 0;
		currentTime = -1;
	}

	public void count() {
		int newTime = getCurrentIntTime();
		if (currentTime == -1) {
			// init time
			currentTime = newTime;
		} else {
			if (newTime == currentTime) {
				// increase counter
				n[p]++;
			} else {
				synchronized (this) {
					int diff = newTime - currentTime;
					if (diff >= SIZE) {
						n = new int[SIZE];
						p = 0;
					} else {
						p += diff;
						n[p]++;
					}
				}
				currentTime = newTime;
			}
		}

	}

	private int getCurrentIntTime() {
		return 1;
	}
}
