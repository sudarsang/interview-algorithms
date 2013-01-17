package com.appinmotion.alg.java;

/*
 I have two methods of an object, and they each access a critical section of code. 
 I want to restrict access to the section so that in one method, I allow multiple threads to access the 
 critical section. In the other method, I want only one thread to have access. If a caller calls the second method,
 it should lock out all clients from accessing the critical section in either of the two functions.
 Here is the basic structure of the class:

 */
public class MutiTread {

	Mutex mutex = new Mutex();

	// Will allow many concurrent threads through, unless there is a
	// call to the other method.
	public void AllowMany() {
		// Here is the critical section that must be protected
		CriticalSection();
	}

	// Will lock out any client, including callers to the other method.
	public void AllowOne() {
		// Here is the critical section that must be protected
		mutex.acquire();
		CriticalSection();
		mutex.release();
	}

	private void CriticalSection() {

	}

	class Mutex {
		public Mutex() {

		}

		public void acquire() {
		}

		public void release() {
		}
	}

	class Semaphore {
		public Semaphore(int count) {
		}

		public void acquire() {
		}

		public void release() {
		}
	}

}
