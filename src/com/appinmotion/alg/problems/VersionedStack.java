package com.appinmotion.alg.problems;

import java.util.ArrayList;
import java.util.List;

/*
 * --- problem ------
 You need to implement a versioned stack, i.e. version of stack will increment after each push/pop. 
 Apart from push/pop, implement a method print(n) which would print stack state corresponding to version 'n'. For example:
 -> initially stack is empty.
 -> Version 1: 11 is pushed
 -> Version 2: 8 is pushed
 -> version 3: pop. only 11 left
 -> Version 4: 15 is pushed
 ....
 And so on.

 Print(n) should print state at version 'n'.

 Here 1 should print 11, 2 should print 8, 11...

 All methods should be as efficient as possible.

 ----solution ---------

 use a dynamic array
 */
public class VersionedStack {

	public static void go() {
		TheStack stack = new TheStack();

		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.push(5);
		stack.pop();
		stack.printVersion();
	}

	public static class TheStack {

		List<Node> mList;

		public TheStack() {
			mList = new ArrayList<Node>();
		}

		public double pop() {
			double result;
			if (mList.size() == 0) {

				result = -1;
			} else {
				Node latestNode = mList.get(mList.size() - 1);
				Node actualNode = null;
				if (latestNode.mIsDeleted) {
					if (latestNode.mNextIndex > -1) {
						actualNode = mList.get(latestNode.mNextIndex);
					}
				} else {
					actualNode = latestNode;
				}
				if (actualNode == null) {
					result = -1;
				} else {
					latestNode.mNextIndex = actualNode.mNextIndex;
					actualNode.mIsDeleted = true;
					result = actualNode.mValue;
				}
			}
			if (result != -1) {
				push(result, true);
			}
			print("pop", result);
			return result;
		}

		private void print(String s, double value) {
			System.out.format("\n%s %.1f -", s, value);
		}

		public void push(double value) {
			push(value, false);
		}

		public void push(double value, boolean isDeletion) {
			Node newNode = new Node();
			newNode.mValue = value;
			newNode.mIsDeletion = isDeletion;
			newNode.mIsDeleted = isDeletion;

			if (mList.size() > 0) {
				Node latestNode = mList.get(mList.size() - 1);
				if (latestNode.mIsDeleted) {
					newNode.mNextIndex = latestNode.mNextIndex;
				} else {
					newNode.mNextIndex = mList.size() - 1;
				}
			} else {
				newNode.mNextIndex = -1;
			}
			mList.add(newNode);
			if (!isDeletion) {
				print("push", value);
			}
		}

		public void printVersion() {
			for (int i = 0; i < mList.size(); i++) {
				System.out.format("\n %d %.1f %s ", i, mList.get(i).mValue,
						!mList.get(i).mIsDeletion ? "push" : "pop");
			}
		}

		public class Node {
			int mNextIndex;
			double mValue;
			boolean mIsDeleted;
			boolean mIsDeletion;
		}
	}
}
